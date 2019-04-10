package group.agv01.service;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IUserService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskServiceTestCase {

	@Autowired
	ITaskService service;

	
	
	@Test
	public void testFindTasks() {		
		List<Task> list = service.findTasks();
		for(Task t : list) {
			System.err.println(t);
		}
		System.err.println("完成1");
	}
	
	@Test
	public void testAddTask() {	
		Task t = new Task();
		t.setTaskID("test2");
		service.addTask(t);
		System.err.println("完成1");
	}
	
	@Test
	public void testDeleteTask() {
		service.delete("test2");
		System.err.println("完成1");
	}
	
	@Test
	public void testChangeTask() {	
		service.changeInfo("test2", "tt");
		System.err.println("完成1");
	}
		
	
}
