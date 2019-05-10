package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.AGVError;
import group.agv01.entity.AGVReco;
import group.agv01.entity.AGVServ;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.AGVErrorMapper;
import group.agv01.mapper.AGVRecoMapper;
import group.agv01.mapper.AGVServMapper;
import group.agv01.mapper.OrderMapper;
import group.agv01.mapper.TaskMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IAGVErrorService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IAGVServService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.UserNotFoundException;


/**
 * 处理任务订单车的业务层实现类
 * @author Alex
 *
 */
@Service
public class AGVErrorServiceImpl implements IAGVErrorService {

	
	@Autowired
	private AGVErrorMapper AGVErrorMapper;
	
	@Override
	public void addAGVError(AGVError AGVError) throws InsertException {
		insertAGVError(AGVError);
		
	}

	
	@Override
	public List<AGVError> findAGVErrors() {
		return getAGVErrors();
	}
	

	@Override
	public List<AGVError> findAGVErrorsDesc() {
		return getAGVErrorsDesc();
	}

	@Override
	public List<AGVError> findAGVErrorsByID(String AGVID) {
		return getAGVErrorsByID(AGVID);
	}
	
	private void insertAGVError(AGVError AGVError) {
		Integer rows = AGVErrorMapper.insertAGVError(AGVError);
		if(rows!=1) {
			throw new InsertException();
		}
	}
	
	private List<AGVError> getAGVErrors(){
		return AGVErrorMapper.getAGVErrors();
	}
	
	private List<AGVError> getAGVErrorsDesc(){
		return AGVErrorMapper.getAGVErrorsDesc();
	}
	
	
	private List<AGVError> getAGVErrorsByID(String AGVID){
		return AGVErrorMapper.getAGVErrorsByID(AGVID);
	}


	



	
	










	


	


	
	
}
