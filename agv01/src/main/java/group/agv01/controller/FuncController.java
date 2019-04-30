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

import group.agv01.entity.Func;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IFuncService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/funcs")
public class FuncController extends BaseController{
	@Autowired
	private IFuncService funcService;
	
	@PostMapping("/reg")
	public ResponseResult<Void> reg(Func func) {	
		System.err.println(func);
		func.setState("0");
		funcService.regFunc(func);				
		return new ResponseResult<Void>(SUCCESS);
	}
	
		
	@PostMapping("/{FuncID}/deleteFunc")
	public ResponseResult<Void> delete(@PathVariable("FuncID")Integer FuncID){
		System.err.println(FuncID);
		funcService.delete(FuncID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{FuncID}/stopFunc")
	public ResponseResult<Void> stop(@PathVariable("FuncID")Integer FuncID){
		System.err.println(FuncID);
		funcService.stop(FuncID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{FuncID}/startFunc")
	public ResponseResult<Void> start(@PathVariable("FuncID")Integer FuncID){
		System.err.println(FuncID);
		funcService.start(FuncID);
		return new ResponseResult<Void>(SUCCESS);
	}

	
	
	
	@GetMapping("/start")
	public ResponseResult<List<Func>> startList() {	
		System.err.println("请求启用功能列表");
		List<Func> data = funcService.findStartFuncs();	
		System.err.println(data);
		return new ResponseResult<List<Func>>(SUCCESS,data);
	}
	
	@GetMapping("/stop")
	public ResponseResult<List<Func>> stopList() {	
		System.err.println("请求停用功能列表");
		List<Func> data = funcService.findStopFuncs();	
		System.err.println(data);
		return new ResponseResult<List<Func>>(SUCCESS,data);
	}

		
}
