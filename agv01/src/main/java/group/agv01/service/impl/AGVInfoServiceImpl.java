package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.AGVInfoMapper;
import group.agv01.mapper.AGVRecoMapper;
import group.agv01.mapper.OrderMapper;
import group.agv01.mapper.TaskMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.service.ex.AGVIDDuplicateException;
import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.TaskIDDuplicateException;
import group.agv01.service.ex.UserNotFoundException;


/**
 * 处理任务订单车的业务层实现类
 * @author Alex
 *
 */
@Service
public class AGVInfoServiceImpl implements IAGVInfoService {

	
	@Autowired
	private AGVInfoMapper AGVInfoTMapper;

	@Override
	public void addAGVInfo(AGVInfo AGVInfo) throws AGVIDDuplicateException, InsertException {
		String AGVID = AGVInfo.getAGVID();
		AGVInfo result = getAGVByID(AGVID);
		if(result==null) {
			insertAGVInfo(AGVInfo);
		}else {
			throw new TaskIDDuplicateException("AGV已存在");
		}
		
		
	}


	@Override
	public void delete(String AGVID) throws DeleteException {
		deleteAGV(AGVID);	
	}
	
	
	@Override
	public List<AGVInfo> findAGVInfos() {
		return getAGVInfos();

	}
	
	private void insertAGVInfo(AGVInfo AGVInfo) {
		Integer rows = AGVInfoTMapper.insertAGVInfo(AGVInfo);
		if(rows!=1) {
			throw new InsertException();
		}
	}

	
	private void deleteAGV(String AGVID) {
		Integer rows = AGVInfoTMapper.deleteAGV(AGVID);
		if(rows!=1) {
			throw new DeleteException();
		}
	}
	

		
	private List<AGVInfo> getAGVInfos(){
		return AGVInfoTMapper.getAGVInfos();
	}
	
	
	private AGVInfo getAGVByID(String AGVID) {
		return AGVInfoTMapper.getAGVByID(AGVID);
	}


	

	
	











	


	


	
	
}
