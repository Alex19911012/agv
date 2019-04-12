package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理AGV基本信息的持久层接口
 * @author Alex
 *
 */
public interface AGVInfoMapper {
	
	/**
	 * 得到AGV基本信息
	 */
	List<AGVInfo> getAGVInfos();
	
}
