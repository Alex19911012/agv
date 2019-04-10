package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.OAGVT;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理订单任务车的持久层接口
 * @author Alex
 *
 */
public interface OAGVTMapper {
	
	/**
	 * 得到订单任务车数据
	 */
	List<OAGVT> getOAGVTs();
	
}
