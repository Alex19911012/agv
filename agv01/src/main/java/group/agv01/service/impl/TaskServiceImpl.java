package group.agv01.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.TaskMapper;
import group.agv01.mapper.UserMapper;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.service.ex.DeleteException;
import group.agv01.service.ex.InsertException;
import group.agv01.service.ex.PasswordNotMatchException;
import group.agv01.service.ex.TaskIDDuplicateException;
import group.agv01.service.ex.TaskNotFoundException;
import group.agv01.service.ex.UpdateException;
import group.agv01.service.ex.UserNotFoundException;


/**
 * 处理用户数据的业务层实现类
 * @author Alex
 *
 */
@Service
public class TaskServiceImpl implements ITaskService {


	@Autowired
	private TaskMapper taskMapper;

	@Override
	public void addTask(Task task) throws TaskIDDuplicateException,InsertException {
		String TaskID = task.getTaskID();
		Task result = getTaskByID(TaskID);
		if(result==null) {
			insertTask(task);
		}else {
			throw new TaskIDDuplicateException("任务已存在");
		}
		

	}






	@Override
	public void delete(String TaskID) throws DeleteException {
		deleteTask(TaskID);

	}






	@Override
	public void changeInfo(String TaskID, String TaskType) throws TaskNotFoundException,UpdateException {
		Task result = getTaskByID(TaskID);
		if(result==null) {
			throw new TaskNotFoundException("修改失败任务不存在");
		}
		updateTask(TaskID, TaskType);

	}



	@Override
	public List<Task> findTasks(){
		return getTasks();
		
	};




	private void insertTask(Task task) {
		Integer rows = taskMapper.insertTask(task);
		if(rows!=1) {
			throw new InsertException();
		}
	}

	
	private void deleteTask(String TaskID) {
		Integer rows = taskMapper.deleteTask(TaskID);
		if(rows!=1) {
			throw new DeleteException();
		}
	}

	
	private void updateTask(String TaskID,String TaskType) {
		Integer rows = taskMapper.updateTask(TaskID, TaskType);
		if(rows!=1) {
			throw new UpdateException();
		}
	}


	private List<Task> getTasks() {
		return taskMapper.getTask();
	}
	
	private Task getTaskByID(String TaskID) {
		return taskMapper.getTaskByID(TaskID);
	}




















}
