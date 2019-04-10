package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/order")
public class OrderController extends BaseController{
	@Autowired
	private IOrderService orderService;
	
	
	
	@GetMapping("/list")
	public ResponseResult<List<Order>> orderList() {	
		System.err.println("请求订单列表");
		List<Order> list = orderService.findOrders();	
		return new ResponseResult<List<Order>>(SUCCESS,list);
	}
	
	
	
}
