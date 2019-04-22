package group.agv01.service;

import java.util.List;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.AGVServ;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.ex.AGVIDDuplicateException;
import group.agv01.service.ex.InsertException;

/**
 * 处理任务订单车的业务层接口
 * @author soft01
 *
 */
public interface IAGVServService {
	void addAGVServ(AGVServ AGVServ)throws InsertException;

	
	List<AGVServ> findAGVServs();
}
