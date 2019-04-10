package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.mapper.UserMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTestCase {
	
	@Autowired
	OrderMapper mapper;
	
	
	
	@Test
	public void testGetOrders() {		
		List<Order> list = mapper.getOrders();
		for(Order t : list) {
			System.err.println(t);
		}
		System.err.println("完成1");
	}
	
	
	


	
	
}
