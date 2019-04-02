package group.agv01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Configuration
@MapperScan("group.agv01.mapper")//关联上持久层接口
public class Agv01Application {

	public static void main(String[] args) {
		SpringApplication.run(Agv01Application.class, args);
	}
	public void testGit() {
		
	}
	

}
