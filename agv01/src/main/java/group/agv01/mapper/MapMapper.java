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
import group.agv01.vo.Map;




/**
 * 这是处理地图持久层接口
 * @author Alex
 *
 */
public interface MapMapper {
	
	/**
	 * 得到地图点和线段数据
	 */
	List<Map> getSourPoint();
	
	List<Map> getDestPoint();
	
}
