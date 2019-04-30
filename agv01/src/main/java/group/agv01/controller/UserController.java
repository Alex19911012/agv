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
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/users")
public class UserController extends BaseController{
	@Autowired
	private IUserService userService;
	
	@PostMapping("/reg")
	public ResponseResult<Void> reg(User user) {	
		System.err.println(user);
		user.setState("0");
		userService.regUser(user);				
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/login")
	public ResponseResult<User> login(User user,HttpSession session) {	
		System.err.println(user);
		User data = userService.findUser(user);	
		session.setAttribute("UserID", data.getUserID());
		session.setAttribute("UserName", data.getUserName());
		return new ResponseResult<User>(SUCCESS,data);
	}
	
	@PostMapping("/{UserID}/deleteUser")
	public ResponseResult<Void> delete(@PathVariable("UserID")Integer UserID){
		System.err.println(UserID);
		userService.delete(UserID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{UserID}/stopUser")
	public ResponseResult<Void> stop(@PathVariable("UserID")Integer UserID){
		System.err.println(UserID);
		userService.stop(UserID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{UserID}/startUser")
	public ResponseResult<Void> start(@PathVariable("UserID")Integer UserID){
		System.err.println(UserID);
		userService.start(UserID);
		return new ResponseResult<Void>(SUCCESS);
	}

	
	@PostMapping("/updatePW")
	public ResponseResult<Void> updatePW(@RequestParam String oPW,@RequestParam String nPW,HttpSession session){		
		Integer UserID = getUidFromSession(session);
		String UserName = session.getAttribute("UserName").toString();	
		userService.changePW(UserID, UserName, oPW, nPW);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@GetMapping("/start")
	public ResponseResult<List<User>> startList() {	
		System.err.println("请求启用列表");
		List<User> data = userService.findStartUsers();	
		System.err.println(data);
		return new ResponseResult<List<User>>(SUCCESS,data);
	}
	
	@GetMapping("/stop")
	public ResponseResult<List<User>> stopList() {	
		System.err.println("请求停用列表");
		List<User> data = userService.findStopUsers();	
		System.err.println(data);
		return new ResponseResult<List<User>>(SUCCESS,data);
	}

		
}
