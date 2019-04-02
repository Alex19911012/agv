package group.agv01.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;


import group.agv01.entity.User;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IUserService;


/**
 * 处理用户数据的业务层实现类
 * @author Alex
 *
 */
@Service
public class UserServletImpl implements IUserService {

	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void reg(User user) {
		insert(user);		
	}
	
	
	private void insert(User user) {
		Integer rows = userMapper.insert(user);
	}
	


	


	


	
	
}
