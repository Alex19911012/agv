package group.agv01.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/task")
public class TaskController extends BaseController{
	@Autowired
	private ITaskService taskService;
	
	
	
	@GetMapping("/list")
	public ResponseResult<List<Task>> taskList() {	
		System.err.println("请求任务列表");
		List<Task> data = taskService.findTasks();	
		System.err.println(data);
		return new ResponseResult<List<Task>>(SUCCESS,data);
	}
	
	@PostMapping("/addTask")
	public ResponseResult<Void> addTask(Task task,HttpSession session) {	
		String UserID = getUidFromSession(session).toString();
		task.setUserID(UserID);
		task.setCreatDate(new Date());
		task.setIsDelete(0);
		System.err.println(task);
		taskService.addTask(task);				
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{TaskID}/delete")
	public ResponseResult<Void> delete(@PathVariable("TaskID")String TaskID){
		System.err.println(TaskID);
		taskService.delete(TaskID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/updateTaskType")
	public ResponseResult<Void> updateTask(@RequestParam String TaskID,@RequestParam String TaskType){		
		taskService.changeInfo(TaskID, TaskType);
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{datemin}&{datemax}&{tState}&{AGVID}/listByDate")
	public ResponseResult<List<Task>> listByDate(@PathVariable("datemin") Date datemin,@PathVariable("datemax")  Date datemax,@PathVariable("tState") String tState,@PathVariable("AGVID") String AGVID){	
		System.err.println(datemin);
		System.err.println(datemax);
		System.err.println(tState);
		System.err.println(AGVID);
		List<Task> data = taskService.findTasksByInfo(datemin, datemax, tState, AGVID);
		return new ResponseResult<List<Task>>(SUCCESS,data);
	}
	
	
}
