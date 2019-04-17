package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVReco;
import group.agv01.entity.DayWarn;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理每日预警的持久层接口
 * @author Alex
 *
 */
public interface DayWarnMapper {
	
	/**
	 * 得到每日预警数据
	 */
	List<DayWarn> getDayWarns();
	
}
