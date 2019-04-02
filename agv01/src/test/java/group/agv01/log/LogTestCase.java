package group.agv01.log;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import group.agv01.entity.User;
import group.agv01.mapper.UserMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTestCase {
	
	
	//记录器
	Logger logger = LoggerFactory.getLogger(Logger.class);
	
	@Test
	public void testLog() {
		//可以调整日志级别,日志的输出会按照这个配置的级别及以上级别生效
		//TRACE < DEBUG < INFO < WARN < ERROR < FATAL
		logger.trace("trace日志");
		logger.debug("debug日志");
		logger.info("info日志");
		logger.warn("warn日志");
		logger.error("error日志");
		
	}
	
	


	
	
}
