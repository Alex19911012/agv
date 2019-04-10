package group.agv01.service;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import group.agv01.entity.OAGVT;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IUserService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class OAGVTServiceTestCase {

	@Autowired
	IOAGVTService service;

	
	
	@Test
	public void testFindOAGVTs() {		
		List<OAGVT> list = service.findOAGVTs();
		for(OAGVT t : list) {
			System.err.println(t);
		}
		System.err.println("完成1");
	}
	
	
		
	
}
