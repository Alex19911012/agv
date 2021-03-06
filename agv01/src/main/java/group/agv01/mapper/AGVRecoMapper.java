package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVReco;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理AGV监控的持久层接口
 * @author Alex
 *
 */
public interface AGVRecoMapper {
	
	/**
	 * 得到AGV监控数据
	 */
	List<AGVReco> getAGVRecos();
	
	/**
	 * 得到AGV最新XY
	 */
	List<AGVReco> getAGVXY();
	
}
