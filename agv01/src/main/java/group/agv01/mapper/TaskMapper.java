package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import group.agv01.entity.Task;
import group.agv01.entity.User;




/**
 * 这是处理任务的持久层接口
 * @author Alex
 *
 */
public interface TaskMapper {
	
	/**
	 * 得到任务数据
	 */
	List<Task> getTask();
	
}
