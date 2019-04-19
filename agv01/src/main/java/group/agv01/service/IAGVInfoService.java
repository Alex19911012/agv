package group.agv01.service;

import java.util.List;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.ex.AGVIDDuplicateException;
import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.TaskIDDuplicateException;

/**
 * 处理AGV档案信息的业务层接口
 * @author soft01
 *
 */
public interface IAGVInfoService {
	void addAGVInfo(AGVInfo AGVInfo)throws AGVIDDuplicateException,InsertException;
	
	void delete(String AGVID)throws DeleteException;
	
	List<AGVInfo> findAGVInfos();
}
