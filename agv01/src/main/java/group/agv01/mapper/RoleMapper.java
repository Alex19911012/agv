package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.Role;
import group.agv01.entity.User;




/**
 * 这是处理角色数据的持久层接口
 * @author Alex
 *
 */
public interface RoleMapper {
	/**
	 * 插入角色数据
	 * @param user
	 * @return
	 */
	Integer insertRole(Role role);
	
	/**
	 * 删除角色数据
	 * @param UserID
	 * @return
	 */
	Integer deleteRole(Integer RoleID);
	
	/**
	 * 停用角色数据
	 * @param UserID
	 * @return
	 */
	Integer stopRole(Integer RoleID);
	
	/**
	 * 启用角色数据
	 * @param UserID
	 * @return
	 */
	Integer startRole(Integer RoleID);

	/**
	 * 得到角色数据根据角色名
	 * @param user
	 * @return
	 */
	Role getRole(Role role);

	
	
	
	
		
	/**
	 * 得到启用的角色数据和用户数据关联
	 * @param user
	 * @return
	 */
	List<Role> getStartRoles();
	
	/**
	 * 得到停用的角色数据
	 * @param user
	 * @return
	 */
	List<Role> getStopRoles();
	
	/**
	 * 	得到所有启用角色数据
	 * @return
	 */
	List<Role> getAllRoles();
}
