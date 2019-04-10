package group.agv01.service.impl;

import java.util.Date;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.service.ex.UsernameDuplicateException;
import group.agv01.entity.User;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IUserService;
import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.UpdateException;
import group.agv01.service.ex.UserNotFoundException;


/**
 * 处理用户数据的业务层实现类
 * @author Alex
 *
 */
@Service
public class UserServiceImpl implements IUserService {

	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void regUser(User user) throws UsernameDuplicateException, InsertException {
		User result = getUser(user);
		if(result==null) {
			insertUser(user);
		}else {
			throw new UsernameDuplicateException("用户名已存在!");
		}
				
	}
		
	@Override
	public void delete(Integer UserID) throws DeleteException{
		deleteUser(UserID);
		
	}



	@Override
	public void changePW(Integer UserID,String UserName,String oPW,String nPW)throws UserNotFoundException, PasswordNotMatchException, UpdateException  {
		User u = new User();
		u.setUserID(UserID);
		u.setUserName(UserName);
		User result = getUser(u);
		if(result==null) {
			throw new UserNotFoundException("修改密码失败！用户名不存在");
		}
		if(!result.getPW().equals(oPW)) {
			throw new PasswordNotMatchException("修改密码失败！原密码错误");
		}
		updatePassword(UserID,nPW);
		
	}

	
	
	
	@Override
	public User findUser(User user) throws UserNotFoundException,PasswordNotMatchException{
		User result = getUser(user);
		if(result==null) {
			throw new UserNotFoundException("用户不存在!");
		}

		if(!result.getPW().equals(user.getPW())) {
			throw new PasswordNotMatchException("密码错误!");
		}
		return result;
	};
	
	
	
	
	private void insertUser(User user) {
		Integer rows = userMapper.insertUser(user);
		if(rows!=1) {
			throw new InsertException("插入数据异常");
		}
	}
	
	private void deleteUser(Integer UserID) {
		Integer rows = userMapper.deleteUser(UserID);
		if(rows!=1) {
			throw new DeleteException("删除数据异常");
		}
	}
	
	
	private void updatePassword(Integer UserID,String PW) {
		Integer rows = userMapper.updatePassword(UserID, PW);
		if(rows!=1) {
			throw new UpdateException("修改数据异常");
		}
	}
	
	private User getUser(User user) {
		return userMapper.getUser(user);
	}



	





	


	


	
	
}
