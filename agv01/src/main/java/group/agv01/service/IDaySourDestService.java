package group.agv01.service;

import java.util.List;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.DaySourDest;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;

/**
 * 处理每日路线业务层接口
 * @author soft01
 *
 */
public interface IDaySourDestService {
	
	List<DaySourDest> findDaySourDests();
	
	
}
