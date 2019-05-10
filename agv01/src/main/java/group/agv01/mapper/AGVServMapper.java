package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.AGVServ;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理AGV维保持久层接口
 * @author Alex
 *
 */
public interface AGVServMapper {
	
	/**
	 * 插入AGV维保数据
	 * @param AGVServ
	 * @return
	 */
	Integer insertAGVServ(AGVServ AGVServ);
	
	/**
	 * 得到AGV维保数据
	 */
	List<AGVServ> getAGVServs();
	
	/**
	 * 根据AGVID得到AGV维保数据
	 */
	List<AGVServ> getAGVServsByID(String AGVID);
	
	
	
}
