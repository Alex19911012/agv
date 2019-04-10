package group.agv01.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import group.agv01.entity.User;
import group.agv01.mapper.UserMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUserName("admin");
		user.setPW("123");
		Integer rows = userMapper.insertUser(user);
		if(rows==1) {
			System.err.println("完成1");
		}
	}
	
	@Test
	public void testGetUser() {
		User u = new User();
		u.setUserName("admin2");
		User user = userMapper.getUser(u);
		System.err.println(user.getPW());
		System.err.println("完成1");
	}
	
	
	


	
	
}
