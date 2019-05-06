package group.agv01.service;


import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.UsernameDuplicateException;

import java.util.List;

import group.agv01.entity.Role;
import group.agv01.entity.User;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.UpdateException;
import group.agv01.service.ex.UserNotFoundException;

/**
 * 处理用户数据的业务层接口
 * @author soft01
 *
 */
public interface IRoleService {
	
	void regRole(Role role)throws UsernameDuplicateException,InsertException;
	
	void delete(Integer RoleID)throws DeleteException;
	
	void stop(Integer RoleID)throws UpdateException;
	
	void start(Integer RoleID)throws UpdateException;
			
	List<Role> findStartRoles();
	
	List<Role> findStopRoles();
	
	List<Role> findAllRoles();
	
}
