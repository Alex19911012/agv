package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
		List<Task> list = taskService.findTasks();	
		return new ResponseResult<List<Task>>(SUCCESS,list);
	}
	
	
	
}
