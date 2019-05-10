package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.Role;
import group.agv01.entity.User;
import group.agv01.vo.RF;
import group.agv01.vo.UR;




/**
 * 这是处理角色和功能关系的的持久层接口
 * @author Alex
 *
 */
public interface RFMapper {
	/**
	 * 插入角色和功能数据
	 * @param RF
	 * @return
	 */
	Integer insertRF(RF rf);
	
	/**
	 * 删除角色和功能数据
	 * @param RoleID
	 * @return
	 */
	Integer deleteRF(String RoleID);
	
	
	
	
	
}
