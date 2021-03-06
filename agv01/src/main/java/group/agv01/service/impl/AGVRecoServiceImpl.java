package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.AGVReco;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.AGVRecoMapper;
import group.agv01.mapper.OrderMapper;
import group.agv01.mapper.TaskMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IAGVRecoService;
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
public class AGVRecoServiceImpl implements IAGVRecoService {

	
	@Autowired
	private AGVRecoMapper AGVRecoTMapper;
	
	
	

	@Override
	public List<AGVReco> findAGVRecos() {
		return getAGVRecos();
	};
	
	
	@Override
	public List<AGVReco> findAGVXY() {
		return getAGVXY();
	}

	
	
	
	private List<AGVReco> getAGVRecos() {
		return AGVRecoTMapper.getAGVRecos();
	}



	private List<AGVReco> getAGVXY(){
		return AGVRecoTMapper.getAGVXY();
	}


	










	


	


	
	
}
