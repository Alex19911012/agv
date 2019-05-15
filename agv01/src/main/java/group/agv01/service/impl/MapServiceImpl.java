package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.DayWorkTime;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.AGVInfoMapper;
import group.agv01.mapper.AGVRecoMapper;
import group.agv01.mapper.DRTMapper;
import group.agv01.mapper.DayWorkOrderMapper;
import group.agv01.mapper.MapMapper;
import group.agv01.mapper.OrderMapper;
import group.agv01.mapper.TaskMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IDRTService;
import group.agv01.service.IDayWorkOrderService;
import group.agv01.service.IDayWorkTimeService;
import group.agv01.service.IMapService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.UserNotFoundException;
import group.agv01.vo.DRT;
import group.agv01.vo.Map;


/**
 * 处理任务订单车的业务层实现类
 * @author Alex
 *
 */
@Service
public class MapServiceImpl implements IMapService {

	@Autowired
	private MapMapper  MapMapper;
	
	
	@Override
	public void addSegmentSDID(Map map) throws InsertException {
		Map result = getPathByID(map.getPathID());
		if(result==null) {
			insertSegmentSDID(map);
		}	
		
	}

	@Override
	public void addSegmentPoint(Map map) throws InsertException{
		Map result = getPointByID(map.getPointID());
		if(result==null) {
			insertSegmentPoint(map);
		}
		
	}
	
	
	@Override
	public List<Map> findSourPoint() {
		return getSourPoint();
	}

	@Override
	public List<Map> findDestPoint() {
		return getDestPoint();
	}	

	
	private List<Map> getSourPoint(){
		return MapMapper.getSourPoint();
	}
	
	private List<Map> getDestPoint(){
		return MapMapper.getDestPoint();
	}

	/**
	 * 插入路段信息(起点-终点,绘制地图用)
	 * @return
	 */
	private void insertSegmentSDID(Map map) throws InsertException{
		Integer rows = MapMapper.insertSegmentSDID(map);
		if(rows!=1) {
			throw new InsertException("插入数据异常");
		}

	}
	
	/**
	 * 插入路段点的信息,绘制地图用
	 */
	private void insertSegmentPoint(Map map) throws InsertException{
		Integer rows = MapMapper.insertSegmentPoint(map);
		if(rows!=1) {
			throw new InsertException("插入数据异常");
		}

	}
	
	/**
	 * 根据ID查path是否存在
	 * @return
	 */
	private Map getPathByID(String PathID) {
		return MapMapper.getPathByID(PathID);
	}
	
	/**
	 * 根据ID查point是否存在
	 * @return
	 */
	private Map getPointByID(String PointID) {
		return MapMapper.getPointByID(PointID);
	}
	



	
	
	
	
	

		
	
	
	
	
	
	











	


	


	
	
}
