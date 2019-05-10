package group.agv01.service;


import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.UsernameDuplicateException;
import group.agv01.vo.RF;
import group.agv01.vo.UR;

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
public interface IRFService {
	
	void addRF(RF rf)throws InsertException;
	
	void moveRF(String RoleID);
	
	
	
}
