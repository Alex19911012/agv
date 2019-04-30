package group.agv01.service;


import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.UsernameDuplicateException;

import java.util.List;

import group.agv01.entity.User;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.UpdateException;
import group.agv01.service.ex.UserNotFoundException;

/**
 * 处理用户数据的业务层接口
 * @author soft01
 *
 */
public interface IUserService {
	
	void regUser(User user)throws UsernameDuplicateException,InsertException;
	
	void delete(Integer UserID)throws DeleteException;
	
	void stop(Integer UserID)throws UpdateException;
	
	void start(Integer UserID)throws UpdateException;
	
	void changePW(Integer UserID,String UserName,String oPW,String nPW)throws UserNotFoundException,PasswordNotMatchException,UpdateException;
	
	User findUser(User user)throws UserNotFoundException,PasswordNotMatchException;
	
	List<User> findStartUsers();
	
	List<User> findStopUsers();
}
