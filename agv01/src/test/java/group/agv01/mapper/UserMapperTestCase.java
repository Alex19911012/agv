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
	public void testInsert() {
		User user = new User();
		user.setName("xiao1");
		userMapper.insert(user);
		System.err.println("完成1");
	}
	
	


	
	
}
