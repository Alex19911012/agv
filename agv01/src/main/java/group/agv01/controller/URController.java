package group.agv01.controller;

import java.util.Date;
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
import group.agv01.service.IURService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;
import group.agv01.vo.UR;


@RestController
@RequestMapping("/ur")
public class URController extends BaseController{
	@Autowired
	private IURService urService;
	
	@PostMapping("/{uID}&{rID}/change")
	public ResponseResult<Void> reg(@PathVariable("uID") String UserID,@PathVariable("rID") String RoleIDs) {	
		System.out.println(UserID);
		System.out.println(RoleIDs);
		String[] RoleID = RoleIDs.split(",");
		System.out.println(RoleID);
		urService.moveUR(UserID);
		UR ur = new UR();
		for(int i=0;i<RoleID.length;i++) {
			ur.setUserID(UserID);
			ur.setRoleID(RoleID[i]);
			urService.addUR(ur);
		}
		
		return new ResponseResult<Void>(SUCCESS);
	}
	
	
	
	
	
	

		
}
