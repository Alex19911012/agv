package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.service.ex.UsernameDuplicateException;
import group.agv01.entity.Func;
import group.agv01.entity.User;
import group.agv01.mapper.FuncMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IFuncService;
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
public class FuncServiceImpl implements IFuncService {

	
	@Autowired
	private FuncMapper funcMapper;
	
	@Override
	public void regFunc(Func func) throws UsernameDuplicateException, InsertException {
		Func result = getFunc(func);
		if(result==null) {
			insertFunc(func);
		}else {
			throw new UsernameDuplicateException("功能已存在!");
		}
		
	}

	
		
	@Override
	public void delete(Integer FuncID) throws DeleteException{
		deleteFunc(FuncID);
		
	}
	
	@Override
	public void stop(Integer FuncID) throws UpdateException {
		stopFunc(FuncID);
	}

	@Override
	public void start(Integer FuncID) throws UpdateException {
		startFunc(FuncID);
	}
	
	@Override
	public List<Func> findStartFuncs() {
		return getStartFuncs();
	}

	@Override
	public List<Func> findStopFuncs() {
		return getStopFuncs();
	}

	
	
	private void insertFunc(Func func) {
		Integer rows = funcMapper.insertFunc(func);
		if(rows!=1) {
			throw new InsertException("插入数据异常");
		}
	}
	
	private void deleteFunc(Integer UserID) {
		Integer rows = funcMapper.deleteFunc(UserID);
		if(rows!=1) {
			throw new DeleteException("删除数据异常");
		}
	}
	
	/**
	 * 停用功能数据
	 * @param UserID
	 * @return
	 */
	private void stopFunc(Integer FuncID) {
		Integer rows = funcMapper.stopFunc(FuncID);
		if(rows!=1) {
			throw new DeleteException("停用数据异常");
		}

	};
	
	/**
	 * 启用功能数据
	 * @param UserID
	 * @return
	 */
	private void startFunc(Integer FuncID) {
		Integer rows = funcMapper.startFunc(FuncID);
		if(rows!=1) {
			throw new DeleteException("启用数据异常");
		}

	}

	
	
	
	
	private Func getFunc(Func func) {
		return funcMapper.getFunc(func);
	}

	/**
	 * 得到启用的用户数据
	 * @param user
	 * @return
	 */
	private List<Func> getStartFuncs(){
		return funcMapper.getStartFuncs();
	}
	
	/**
	 * 得到停用的用户数据
	 * @param user
	 * @return
	 */
	private List<Func> getStopFuncs(){
		return funcMapper.getStopFuncs();
	}

	
	


	





	


	


	
	
}
