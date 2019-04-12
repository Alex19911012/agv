package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.OrderMapper;
import group.agv01.mapper.TaskMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.OrderIDDuplicateException;
import group.agv01.service.ex.OrderNotFoundException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.TaskIDDuplicateException;
import group.agv01.service.ex.TaskNotFoundException;
import group.agv01.service.ex.UpdateException;
import group.agv01.service.ex.UserNotFoundException;


/**
 * 处理用户数据的业务层实现类
 * @author Alex
 *
 */
@Service
public class OrderServiceImpl implements IOrderService {

	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public void addOrder(Order order) throws OrderIDDuplicateException, InsertException {
		String OrderID = order.getOrderID();
		Order result = getOrderByID(OrderID);
		if(result==null) {
			insertOrder(order);
		}else {
			throw new OrderIDDuplicateException("订单已存在");
		}
		
	}






	@Override
	public void delete(String OrderID) throws DeleteException {
		deleteOrder(OrderID);		
	}






	@Override
	public void changeInfo(String OrderID, String OType) throws OrderNotFoundException, UpdateException {
		Order result = getOrderByID(OrderID);
		if(result==null) {
			throw new OrderNotFoundException("修改失败订单不存在");
		}
		updateOrder(OrderID, OType);

		
	}
	

	@Override
	public List<Order> findOrders() {
		return getOrders();
	};
	
	@Override
	public List<Order> findOrdersByTID(String TID) {
			return getOrdersByTID(TID);
	}
	
	
	
	private void insertOrder(Order order) {
		Integer rows = orderMapper.insertOrder(order);
		if(rows!=1) {
			throw new InsertException("插入时出现未知错误");
		}
	}
	
	
	private void deleteOrder(String OrderID) {
		Integer rows = orderMapper.deleteOrder(OrderID);
		if(rows!=1) {
			throw new DeleteException("删除时出现未知错误");
		}	
		
	}
	
	private	void updateOrder(String OrderID,String OType) {
		Integer rows = orderMapper.updateOrder(OrderID, OType);
		if(rows!=1) {
			throw new UpdateException("修改数据时发生未知错误");
		}
	}
	
	
	private List<Order> getOrders() {
		return orderMapper.getOrders();
	}
	
	private List<Order> getOrdersByTID(String TID) {
		return orderMapper.getOrdersByTID(TID);
	}


	private Order getOrderByID(String OrderID) {
		return orderMapper.getOrderByID(OrderID);
	}






	



	










	


	


	
	
}
