package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVError;
import group.agv01.entity.AGVReco;
import group.agv01.entity.AGVServ;
import group.agv01.entity.AGVWarn;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理AGV监控的持久层接口
 * @author Alex
 *
 */
public interface AGVWarnMapper {
	
	
	
	/**
	 * 得到AGV预警数据
	 */
	List<AGVWarn> getAGVWarns();
	
}
