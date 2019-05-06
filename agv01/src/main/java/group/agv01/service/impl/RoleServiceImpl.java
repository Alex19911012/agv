package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.service.ex.UsernameDuplicateException;
import group.agv01.entity.Role;
import group.agv01.entity.User;
import group.agv01.mapper.RoleMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.IRoleService;
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
public class RoleServiceImpl implements IRoleService {

	
	@Autowired
	private RoleMapper roleMapper;
	
			
	@Override
	public void delete(Integer RoleID) throws DeleteException{
		deleteRole(RoleID);
		
	}
	
	@Override
	public void stop(Integer RoleID) throws UpdateException {
		stopRole(RoleID);
	}

	@Override
	public void start(Integer RoleID) throws UpdateException {
		startRole(RoleID);
	}

	@Override
	public void regRole(Role role) throws InsertException {
		Role result = getRole(role);
		if(result==null) {
			insertRole(role);
		}else {
			throw new UsernameDuplicateException("角色名已存在!");
		}
		
	}

	@Override
	public List<Role> findStartRoles() {
		return getStartRoles();
	}

	@Override
	public List<Role> findStopRoles() {
		return getStopRoles();
	}

	@Override
	public List<Role> findAllRoles() {
		return getAllRoles();
	}



	
	
	
	
	private void insertRole(Role role) {
		Integer rows = roleMapper.insertRole(role);
		if(rows!=1) {
			throw new InsertException("插入数据异常");
		}
	}
	
	private void deleteRole(Integer RoleID) {
		Integer rows = roleMapper.deleteRole(RoleID);
		if(rows!=1) {
			throw new DeleteException("删除数据异常");
		}
	}
	
	/**
	 * 停用用户数据
	 * @param UserID
	 * @return
	 */
	private void stopRole(Integer RoleID) {
		Integer rows = roleMapper.stopRole(RoleID);
		if(rows!=1) {
			throw new DeleteException("停用数据异常");
		}

	};
	
	/**
	 * 启用用户数据
	 * @param UserID
	 * @return
	 */
	private void startRole(Integer RoleID) {
		Integer rows = roleMapper.startRole(RoleID);
		if(rows!=1) {
			throw new DeleteException("启用数据异常");
		}

	}

	
	
		
	
	/**
	 * 得到启用的角色数据
	 * @param user
	 * @return
	 */
	private List<Role> getStartRoles(){
		return roleMapper.getStartRoles();
	}
	
	/**
	 * 得到停用的角色数据
	 * @param user
	 * @return
	 */
	private List<Role> getStopRoles(){
		return roleMapper.getStopRoles();
	}

	
	
	private Role getRole(Role role) {
		return roleMapper.getRole(role);
	}
	
	private List<Role> getAllRoles(){
		return roleMapper.getAllRoles();
	}

	
	





	


	


	
	
}
