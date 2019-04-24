package group.agv01.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import group.agv01.mapper.DRTMapper;
import group.agv01.vo.DRT;
import group.agv01.vo.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MapMapperTestCase {
	
	@Autowired
	MapMapper mapper;
	
	@Test
	public void testGet1() {		
		List<Map> list = mapper.getSourPoint();
		for(Map r : list) {
			System.err.println(r);
		}
		System.err.println("完成1");
	}
	
	@Test
	public void testGet2() {		
		List<Map> list = mapper.getDestPoint();
		for(Map r : list) {
			System.err.println(r);
		}
		System.err.println("完成1");
	}
	
	
	


	
	
}
