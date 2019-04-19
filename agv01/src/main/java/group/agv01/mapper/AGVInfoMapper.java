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
	 * 插入AGV档案数据
	 * @param AGVInfo
	 * @return
	 */
	Integer insertAGVInfo(AGVInfo AGVInfo);
	
	/**
	 * 删除AGV档案数据
	 * @param AGVID
	 * @return
	 */
	Integer deleteAGV(String AGVID);

	
	/**
	 * 得到AGV基本信息
	 */
	List<AGVInfo> getAGVInfos();
	
	/**
	 * 根据ID得到AGV
	 * @param AGVID
	 * @return
	 */
	AGVInfo getAGVByID(String AGVID);
	
}
