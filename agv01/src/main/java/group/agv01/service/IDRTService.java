package group.agv01.service;

import java.util.List;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.DayWorkTime;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.vo.DRT;

/**
 * 处理高低峰业务层接口
 * @author soft01
 *
 */
public interface IDRTService {
	
	
	List<DRT> findDRTs();
}
