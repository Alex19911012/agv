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
	Integer insert(User user);
	
	
}
