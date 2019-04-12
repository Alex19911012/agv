package group.agv01.service;

import java.util.List;

import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.OrderIDDuplicateException;
import group.agv01.service.ex.OrderNotFoundException;
import group.agv01.service.ex.TaskIDDuplicateException;
import group.agv01.service.ex.TaskNotFoundException;
import group.agv01.service.ex.UpdateException;

/**
 * 处理任务数据的业务层接口
 * @author soft01
 *
 */
public interface IOrderService {
	
	void addOrder(Order order)throws OrderIDDuplicateException,InsertException;
	
	void delete(String OrderID)throws DeleteException;
	
	void changeInfo(String OrderID,String OType)throws OrderNotFoundException,UpdateException;
	
	List<Order> findOrders();
	
	List<Order> findOrdersByTID(String TID);
}
