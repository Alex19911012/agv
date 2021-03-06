package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVError;
import group.agv01.entity.AGVReco;
import group.agv01.entity.AGVServ;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理AGV监控的持久层接口
 * @author Alex
 *
 */
public interface AGVErrorMapper {
	
	/**
	 * 插入AGV故障数据
	 * @param AGVError
	 * @return
	 */
	Integer insertAGVError(AGVError AGVError);
	
	/**
	 * 得到AGV故障数据
	 */
	List<AGVError> getAGVErrors();
	
	/**
	 * 得到AGV监控中故障最新数据
	 */
	List<AGVError> getAGVErrorsDesc();
	
	/**
	 * 根据ID得到AGV故障数据
	 * @param AGVID
	 * @return
	 */
	List<AGVError> getAGVErrorsByID(String AGVID);
	
}
