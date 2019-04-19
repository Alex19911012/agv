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
		List<Order> data = orderService.findOrders();	
		return new ResponseResult<List<Order>>(SUCCESS,data);
	}
	
	@PostMapping("/addOrder")
	public ResponseResult<Void> addOrder(Order order,HttpSession session) {	
		String UserID = getUidFromSession(session).toString();
		order.setUserID(UserID);
		order.setODate(new Date());
		order.setIsDelete(0);
		System.err.println(order);
		orderService.addOrder(order);				
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{OrderID}/delete")
	public ResponseResult<Void> delete(@PathVariable("OrderID")String OrderID){
		System.err.println(OrderID);
		orderService.delete(OrderID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/updateOType")
	public ResponseResult<Void> updateOrder(@RequestParam String OrderID,@RequestParam String OType){		
		orderService.changeInfo(OrderID, OType);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{TID}/list")
	public ResponseResult<List<Order>> listByTID(@PathVariable("TID")String TID){
		System.err.println(TID);
		List<Order> data = orderService.findOrdersByTID(TID);
		return new ResponseResult<List<Order>>(SUCCESS,data);
	}

	
}
