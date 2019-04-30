package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.User;




/**
 * 这是处理用户数据的持久层接口
 * @author Alex
 *
 */
public interface UserMapper {
	/**
	 * 插入用户数据
	 * @param user
	 * @return
	 */
	Integer insertUser(User user);
	
	/**
	 * 删除用户数据
	 * @param UserID
	 * @return
	 */
	Integer deleteUser(Integer UserID);
	
	/**
	 * 停用用户数据
	 * @param UserID
	 * @return
	 */
	Integer stopUser(Integer UserID);
	
	/**
	 * 启用用户数据
	 * @param UserID
	 * @return
	 */
	Integer startUser(Integer UserID);


	
	/**
	 * 更改用户密码
	 * @param UserID
	 * @param PW
	 * @return
	 */
	Integer updatePassword(@Param("UserID")Integer UserID,@Param("PW")String PW);
	
	
	
	/**
	 * 得到用户数据根据用户名
	 * @param user
	 * @return
	 */
	User getUser(User user);
	
	/**
	 * 得到启用的用户数据
	 * @param user
	 * @return
	 */
	List<User> getStartUsers();
	
	/**
	 * 得到停用的用户数据
	 * @param user
	 * @return
	 */
	List<User> getStopUsers();
}
