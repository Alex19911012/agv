package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.service.ex.UsernameDuplicateException;
import group.agv01.vo.UR;
import group.agv01.entity.Role;
import group.agv01.entity.User;
import group.agv01.mapper.RoleMapper;
import group.agv01.mapper.URMapper;
import group.agv01.mapper.UserMapper;
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
public class URServiceImpl implements IURService {

	
	@Autowired
	private URMapper urMapper;

	@Override
	public void addUR(UR ur) throws InsertException {
		insertUR(ur);
	}

	@Override
	public void moveUR(String UserID)  {
		deleteUR(UserID);
	}
	
	
	
	/**
	 * 插入用户和角色数据
	 * @param UR
	 * @return
	 */
	private void insertUR(UR ur) throws InsertException{
		Integer rows = urMapper.insertUR(ur);
		if(rows!=1) {
			throw new InsertException("插入数据异常");
		}
	}
	
	/**
	 * 删除用户和角色数据
	 * @param UserID
	 * @return
	 */
	private void deleteUR(String UserID) {
		urMapper.deleteUR(UserID);
	}

	
			
		
	





	


	


	
	
}
