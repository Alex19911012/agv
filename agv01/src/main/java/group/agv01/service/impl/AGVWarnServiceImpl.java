package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.AGVWarn;
import group.agv01.mapper.AGVWarnMapper;
import group.agv01.service.IAGVWarnService;


/**
 * 处理任务订单车的业务层实现类
 * @author Alex
 *
 */
@Service
public class AGVWarnServiceImpl implements IAGVWarnService {
	@Autowired
	private AGVWarnMapper AGVWarnMapper;
	
	@Override
	public List<AGVWarn> findAGVWarns() {
		return getAGVWarns();
	}
	
	private List<AGVWarn> getAGVWarns(){
		return AGVWarnMapper.getAGVWarns();
	}

	
	

	
	










	


	


	
	
}
