package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.OAGVT;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.OAGVTMapper;
import group.agv01.mapper.OrderMapper;
import group.agv01.mapper.TaskMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IOAGVTService;
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
public class OAGVTServiceImpl implements IOAGVTService {

	
	@Autowired
	private OAGVTMapper OAGVTMapper;
	
	
	

	@Override
	public List<OAGVT> findOAGVTs() {
		return getOAGVTs();
	};
	
	
	
	
	
	
	private List<OAGVT> getOAGVTs() {
		return OAGVTMapper.getOAGVTs();
	}











	


	


	
	
}