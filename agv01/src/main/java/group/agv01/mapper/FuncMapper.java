package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.Func;
import group.agv01.entity.User;




/**
 * 这是处理功能数据的持久层接口
 * @author Alex
 *
 */
public interface FuncMapper {
	/**
	 * 插入功能数据
	 * @param user
	 * @return
	 */
	Integer insertFunc(Func func);
	
	/**
	 * 删除功能数据
	 * @param UserID
	 * @return
	 */
	Integer deleteFunc(Integer FuncID);
	
	/**
	 * 停用功能数据
	 * @param UserID
	 * @return
	 */
	Integer stopFunc(Integer FuncID);
	
	/**
	 * 启用功能数据
	 * @param UserID
	 * @return
	 */
	Integer startFunc(Integer FuncID);


	
		
	
	
	/**
	 * 得到功能数据根据功能名
	 * @param user
	 * @return
	 */
	Func getFunc(Func func);
	
	/**
	 * 得到启用的功能数据
	 * @param user
	 * @return
	 */
	List<Func> getStartFuncs();
	
	/**
	 * 得到停用的功能数据
	 * @param user
	 * @return
	 */
	List<Func> getStopFuncs();
	
	/**
	 * 得到所有启用的功能数据用于修改RF
	 * @return
	 */
	List<Func> getAllFuncs();
}
