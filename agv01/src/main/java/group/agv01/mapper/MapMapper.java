package group.agv01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.vo.Map;




/**
 * 这是处理地图持久层接口
 * @author Alex
 *
 */
public interface MapMapper {
	
	/**
	 * 插入路段信息(起点-终点,绘制地图用)
	 * @return
	 */
	Integer insertSegmentSDID(Map map);
	
	
	
	/**
	 * 插入路段点的信息,绘制地图用
	 */
	Integer insertSegmentPoint(Map map);
	
	/**
	 * 得到地图点和线段数据(起点)
	 */
	List<Map> getSourPoint();
	/**
	 * 得到地图点和线段数据(终点点)
	 */
	List<Map> getDestPoint();
	
	/**
	 * 根据ID查path是否存在
	 * @return
	 */
	Map getPathByID(String PathID);
	
	/**
	 * 根据ID查point是否存在
	 * @return
	 */
	Map getPointByID(String PointID);
	
	

}
