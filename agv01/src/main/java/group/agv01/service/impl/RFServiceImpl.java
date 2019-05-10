package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.service.ex.UsernameDuplicateException;
import group.agv01.vo.RF;
import group.agv01.vo.UR;
import group.agv01.entity.Role;
import group.agv01.entity.User;
import group.agv01.mapper.RFMapper;
import group.agv01.mapper.RoleMapper;
import group.agv01.mapper.URMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IRFService;
import group.agv01.service.IRoleService;
import group.agv01.service.IURService;
import group.agv01.service.IUserService;
import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.UpdateException;
import group.agv01.service.ex.UserNotFoundException;


/**
 * 处理角色数据的业务层实现类
 * @author Alex
 *
 */
@Service
public class RFServiceImpl implements IRFService {

	
	@Autowired
	private RFMapper rfMapper;

	@Override
	public void addRF(RF rf) throws InsertException {
		insertRF(rf);
	}

	@Override
	public void moveRF(String RoleID)  {
		deleteRF(RoleID);
	}
	
	
	
	private void insertRF(RF rf) throws InsertException{
		Integer rows = rfMapper.insertRF(rf);
		if(rows!=1) {
			throw new InsertException("插入数据异常");
		}
	}
	
	
	private void deleteRF(String RoleID) {
		rfMapper.deleteRF(RoleID);
	}

	
			
		
	





	


	


	
	
}
