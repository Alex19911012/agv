package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.DayError;
import group.agv01.entity.DayWarn;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.AGVInfoMapper;
import group.agv01.mapper.AGVRecoMapper;
import group.agv01.mapper.DayErrorMapper;
import group.agv01.mapper.DayWarnMapper;
import group.agv01.mapper.DayWorkOrderMapper;
import group.agv01.mapper.OrderMapper;
import group.agv01.mapper.TaskMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IDayErrorService;
import group.agv01.service.IDayWarnService;
import group.agv01.service.IDayWorkOrderService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.UserNotFoundException;


/**
 * 处理预警的业务层实现类
 * @author Alex
 *
 */
@Service
public class DayWarnServiceImpl implements IDayWarnService {

	
	@Autowired
	private DayWarnMapper DayWarnMapper;

	@Override
	public List<DayWarn> findDayWarns() {
		return getDayWarns();
	}
	
	private List<DayWarn> getDayWarns(){
		return DayWarnMapper.getDayWarns();
	}

	
	
	
	

		
	
	
	
	
	
	











	


	


	
	
}
