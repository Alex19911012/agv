package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.DayRunDist;
import group.agv01.mapper.DayRunDistMapper;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IDayRunDistService;
import group.agv01.service.IDayWorkOrderService;
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
public class DayRunDistServiceImpl implements IDayRunDistService{

	@Autowired
	private DayRunDistMapper  DayRunDistMapper;
	
	@Override
	public List<DayRunDist> findDayRunDists() {
		return getDayRunDists();
	};

	
	private List<DayRunDist> getDayRunDists(){
		return DayRunDistMapper.getDayRunDists();
	}

		
	
	

		
	
	
	
	
	
	











	


	


	
	
}
