package group.agv01.mapper;

import java.util.Date;
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
	 * 更改用户密码
	 * @param UserID
	 * @param PW
	 * @return
	 */
	Integer updatePassword(@Param("UserID")Integer UserID,@Param("PW")String PW);
	
	
	
	/**
	 * 得到所有用户数据
	 * @param user
	 * @return
	 */
	User getUser(User user);
	
}
