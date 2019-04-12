package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理订单的持久层接口
 * @author Alex
 *
 */
public interface OrderMapper {
	
	/**
	 * 插入订单数据
	 * @param Order
	 * @return
	 */
	Integer insertOrder(Order order);
	
	/**
	 * 删除订单数据
	 * @param OrderID
	 * @return
	 */
	Integer deleteOrder(String OrderID);
	
	/**
	 * 更改订单数据
	 * @param OrderID
	 * @param OType
	 * @return
	 */
	Integer updateOrder(@Param("OrderID")String OrderID,@Param("OType")String OType);
	
	
	/**
	 * 得到订单数据
	 */
	List<Order> getOrders();
	
	/**
	 * 根据ID得到订单
	 * @param TaskID
	 * @return
	 */
	Order getOrderByID(String OrderID);
	
	/**
	 * 根据任务ID得到订单
	 * @return
	 */
	List<Order> getOrdersByTID(String TID);
}
