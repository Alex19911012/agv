package group.agv01.service;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import group.agv01.entity.User;
import group.agv01.service.IUserService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {

	@Autowired
	IUserService service;

	@Test
	public void regUser() {
		User user = new User();
		user.setUserName("root");
		user.setPW("123");
		service.regUser(user);
		System.err.println("完成2");
	}
	
	@Test
	public void getUser() {
		User u = new User();
		u.setUserName("admin");
		User user = service.findUser(u);
		System.err.println(user.getPW());
		System.err.println("完成22");
	}
	
	
		
	
}
