package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVReco;
import group.agv01.entity.DaySourDest;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理每日起止路线的持久层接口
 * @author Alex
 *
 */
public interface DaySourDestMapper {
	
	/**
	 * 得到每日起止路线数据
	 */
	List<DaySourDest> getDaySourDest();
	
}
