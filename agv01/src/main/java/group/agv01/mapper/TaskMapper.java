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
	 * 插入任务数据
	 * @param Task
	 * @return
	 */
	Integer insertTask(Task task);
	
	/**
	 * 删除任务数据
	 * @param TaskID
	 * @return
	 */
	Integer deleteTask(String TaskID);
	
	/**
	 * 更改数据
	 * @param TaskID
	 * @param TaskType
	 * @return
	 */
	Integer updateTask(@Param("TaskID")String TaskID,@Param("TaskType")String TaskType);
	
	
	/**
	 * 得到任务数据
	 */
	List<Task> getTask();
	
	/**
	 * 根据ID得到Task
	 * @param TaskID
	 * @return
	 */
	Task getTaskByID(String TaskID);
	
	/**
	 * 根据日期等获得任务数据
	 * @param datemin
	 * @param datemax
	 * @param tState
	 * @param AGVID
	 * @return
	 */
	List<Task> getTaskBydate(@Param("datemin")Date datemin,@Param("datemax")Date datemax,@Param("tState")String tState,@Param("AGVID")String AGVID);
	
}
