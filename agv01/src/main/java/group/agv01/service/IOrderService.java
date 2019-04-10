package group.agv01.service;

import java.util.List;

import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;

/**
 * 处理任务数据的业务层接口
 * @author soft01
 *
 */
public interface IOrderService {
	
	
	List<Order> findOrders();
}
