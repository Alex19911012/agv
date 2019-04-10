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
	 * 得到订单数据
	 */
	List<Order> getOrders();
	
}
