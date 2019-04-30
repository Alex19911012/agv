package group.agv01.service;


import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.UsernameDuplicateException;

import java.util.List;

import group.agv01.entity.Func;
import group.agv01.entity.User;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.UpdateException;
import group.agv01.service.ex.UserNotFoundException;

/**
 * 处理用户数据的业务层接口
 * @author soft01
 *
 */
public interface IFuncService {
	
	void regFunc(Func func)throws UsernameDuplicateException,InsertException;
	
	void delete(Integer FuncID)throws DeleteException;
	
	void stop(Integer FuncID)throws UpdateException;
	
	void start(Integer FuncID)throws UpdateException;
		
	List<Func> findStartFuncs();
	
	List<Func> findStopFuncs();
}
