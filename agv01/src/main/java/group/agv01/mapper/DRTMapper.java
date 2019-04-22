package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVReco;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.DayWorkTime;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.vo.DRT;




/**
 * 这是处理高低峰的持久层接口
 * @author Alex
 *
 */
public interface DRTMapper {
	
	/**
	 * 得到高低峰表
	 */
	List<DRT> getDRT();
	
}
