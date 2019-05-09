package group.agv01.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.annotation.JsonFormat;

import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.UserMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskMapperTestCase {
	
	@Autowired
	TaskMapper mapper;
	
	
	
	@Test
	public void testGetTasks() {		
		List<Task> list = mapper.getTask();
		for(Task t : list) {
			System.err.println(t);
		}
		System.err.println("完成1");
	}
	
	@Test
	public void testInsertTask() {
		Task task = new Task();
		task.setTaskID("test");
		task.setTaskType("test");
		Integer rows = mapper.insertTask(task);
		System.err.println(rows);
	}
	
	@Test
	public void testDeleteTask() {
		String TaskID = "test";
		Integer rows = mapper.deleteTask(TaskID);
		System.err.println(rows);
	}
	
	@Test
	public void testUpdateTask() {
		String TaskID = "test";
		String TaskType = "TTTT";
		Integer rows = mapper.updateTask(TaskID, TaskType);
		System.err.println(rows);
	}

	@Test
	public void testGetTaskByID() {
		String TaskID = "test";
		Task t = mapper.getTaskByID(TaskID);
		System.err.println(t);
	}
	
	@Test
	public void testGetTaskByDate() throws ParseException {
		String AGVID = "2";
		String tState = "R";
		String max= "2019-6-2 00:00:00";
		String min = "2019-6-1 00:00:00";
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date datemax=format.parse(max);
		Date datemin=format.parse(min);
		System.err.println(datemax);

		List<Task> list = mapper.getTaskBydate(datemin, datemax, tState, AGVID);
		for(Task t : list) {
			System.err.println(t);
		}

	}

	
	
	
	


	
	
}
