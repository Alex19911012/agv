package group.agv01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.User;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private IUserService userService;
	
	public static final Integer SUCCESS = 200;
	
	@GetMapping("/reg")
	public ResponseResult<Void> reg(User user) {	
		System.err.println(user);
		userService.reg(user);				
		return new ResponseResult<Void>(SUCCESS);
	}
}
