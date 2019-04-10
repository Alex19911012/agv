package group.agv01.service;

import java.util.List;

import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.TaskIDDuplicateException;
import group.agv01.service.ex.TaskNotFoundException;
import group.agv01.service.ex.UpdateException;
import group.agv01.service.ex.UserNotFoundException;
import group.agv01.service.ex.UsernameDuplicateException;

/**
 * 处理任务数据的业务层接口
 * @author soft01
 *
 */
public interface ITaskService {
	
	void addTask(Task task)throws TaskIDDuplicateException,InsertException;
	
	void delete(String TaskID)throws DeleteException;
	
	void changeInfo(String TaskID,String TaskType)throws TaskNotFoundException,UpdateException;
		
	List<Task> findTasks();
}
