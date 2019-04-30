package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import group.agv01.entity.AGVWarn;
import group.agv01.mapper.DRTMapper;
import group.agv01.vo.DRT;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WarnMapperTestCase {
	
	@Autowired
	AGVWarnMapper mapper;
	
	@Test
	public void testGetDRTs() {		
		List<AGVWarn> list = mapper.getAGVWarns();
		System.err.println(list);
		for(AGVWarn r : list) {
			System.err.println(r);
		}
		System.err.println("完成1");
	}
	
	
	


	
	
}
