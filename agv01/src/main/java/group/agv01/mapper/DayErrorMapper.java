package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVReco;
import group.agv01.entity.DayError;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理每日故障的持久层接口
 * @author Alex
 *
 */
public interface DayErrorMapper {
	
	/**
	 * 得到每日故障数据
	 */
	List<DayError> getDayErrors();
	
}
