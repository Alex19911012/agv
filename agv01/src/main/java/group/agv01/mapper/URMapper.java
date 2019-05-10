package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.Role;
import group.agv01.entity.User;
import group.agv01.vo.UR;




/**
 * 这是处理用户和角色关系的的持久层接口
 * @author Alex
 *
 */
public interface URMapper {
	/**
	 * 插入用户和角色数据
	 * @param UR
	 * @return
	 */
	Integer insertUR(UR ur);
	
	/**
	 * 删除用户和角色数据
	 * @param UserID
	 * @return
	 */
	Integer deleteUR(String UserID);
	
	
	
	
	
}
