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
	
	@Test
	public void testInsertOrder() {
		Order order = new Order();
		order.setOrderID("test");
		order.setOType("test");
		Integer rows = mapper.insertOrder(order);
		System.err.println(rows);
	}
	
	@Test
	public void testDeleteOrder() {
		String OrderID = "test";
		Integer rows = mapper.deleteOrder(OrderID);
		System.err.println(rows);
	}
	
	@Test
	public void testUpdateOrder() {
		String OrderID = "test";
		String OType = "TTTT";
		Integer rows = mapper.updateOrder(OrderID, OType);
		System.err.println(rows);
	}

	@Test
	public void testGetOrderkByID() {
		String OrderID = "test";
		Order order = mapper.getOrderByID(OrderID);
		System.err.println(order);
	}
	


	
	
}
