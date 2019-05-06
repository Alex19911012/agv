package group.agv01.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.Order;
import group.agv01.entity.Role;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IRoleService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/roles")
public class RoleController extends BaseController{
	@Autowired
	private IRoleService roleService;
	
	@PostMapping("/reg")
	public ResponseResult<Void> reg(Role role) {	
		
		role.setState("0");
		System.err.println(role);
		roleService.regRole(role);				
		return new ResponseResult<Void>(SUCCESS);
	}
	
	
	
	@PostMapping("/{RoleID}/deleteRole")
	public ResponseResult<Void> delete(@PathVariable("RoleID")Integer RoleID){
		System.err.println(RoleID);
		roleService.delete(RoleID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{RoleID}/stopRole")
	public ResponseResult<Void> stop(@PathVariable("RoleID")Integer RoleID){
		System.err.println(RoleID);
		roleService.stop(RoleID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{RoleID}/startRole")
	public ResponseResult<Void> start(@PathVariable("RoleID")Integer RoleID){
		System.err.println(RoleID);
		roleService.start(RoleID);
		return new ResponseResult<Void>(SUCCESS);
	}

	
		
	@GetMapping("/start")
	public ResponseResult<List<Role>> startList() {	
		System.err.println("请求启用角色列表");
		List<Role> data = roleService.findStartRoles();	
		System.err.println(data);
		return new ResponseResult<List<Role>>(SUCCESS,data);
	}
	
	@GetMapping("/stop")
	public ResponseResult<List<Role>> stopList() {	
		System.err.println("请求停用角色列表");
		List<Role> data = roleService.findStopRoles();	
		System.err.println(data);
		return new ResponseResult<List<Role>>(SUCCESS,data);
	}
	
	@GetMapping("/all")
	public ResponseResult<List<Role>> allList(){
		System.err.println("请求所有角色列表");
		List<Role> data = roleService.findAllRoles();	
		System.err.println(data);
		return new ResponseResult<List<Role>>(SUCCESS,data);
	}

		
}
