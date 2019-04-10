package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
	
	
	


	
	
}
