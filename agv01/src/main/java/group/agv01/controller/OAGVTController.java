package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.OAGVT;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IOAGVTService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/oagvt")
public class OAGVTController extends BaseController{
	@Autowired
	private IOAGVTService oagvtService;
	
	
	
	@GetMapping("/list")
	public ResponseResult<List<OAGVT>> OAGVTList() {	
		System.err.println("请求任务订单车列表");
		List<OAGVT> list = oagvtService.findOAGVTs();	
		return new ResponseResult<List<OAGVT>>(SUCCESS,list);
	}
	
	
	
}
