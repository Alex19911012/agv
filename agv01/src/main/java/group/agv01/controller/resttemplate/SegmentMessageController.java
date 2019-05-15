package group.agv01.controller.resttemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import group.agv01.base.message.conversion.SegmentConversionMap;
import group.agv01.base.message.map.SegmentMessage;
import group.agv01.service.IMapService;
import group.agv01.vo.Map;

@RestController
public class SegmentMessageController {
	@Autowired
	private IMapService MapService;
	
    /***********HTTP GET method*************/
    @GetMapping("/map-update")
    public void getSegments(){
    	try {
    		RestTemplate restTemplate = new RestTemplate();
    		String url="http://192.168.11.135:8000/segment-info/list";//注意这里的端口号
            Integer[] results = restTemplate.getForObject(url, Integer[].class);
            System.err.println("返回地图数据ID数==="+results.length);    
            
            String url2 = "http://192.168.11.135:8000/segment-info/{segmentId}";//注意这里的端口号
            for(int i=0;i<results.length;i++) {
            	String result2 = restTemplate.getForObject(url2, String.class,results[i]);
            	List<SegmentMessage> model = JSON.parseArray(result2, SegmentMessage.class);
            	System.err.println(model);
            	
            	Map path = SegmentConversionMap.segmentToPath(model.get(0));
            	System.err.println("插入路径"+path);
            	MapService.addSegmentSDID(path);
            	
            	Map sPoint = SegmentConversionMap.segmentToSourPoint(model.get(0));
            	System.err.println("插入起点"+sPoint);
            	MapService.addSegmentPoint(sPoint);
            	
            	Map dPoint = SegmentConversionMap.segmentToDestPoint(model.get(0));
            	System.err.println("插入终点"+dPoint);
            	MapService.addSegmentPoint(dPoint);
            	
            	
            	

            }        
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    
    
    
    
 
//    /**********HTTP POST method**************/
//    @PostMapping(value = "/bbb")
//    public Object postJson(@RequestBody JSONObject param) {
//        System.out.println(param.toJSONString());
//        param.put("action", "post");
//        param.put("username", "tester");
//        param.put("pwd", "123456748");
//        return param;
//    }
 
//    @PostMapping(value = "/testPostApi")
//    public Object testPost() {
//        String url = "http://localhost:8081/girl/testPost";
//        JSONObject postData = new JSONObject();
//        postData.put("descp", "request for post");
//        JSONObject json = restTemplate.postForEntity(url, postData, JSONObject.class).getBody();
//        return json;
//    }

}
