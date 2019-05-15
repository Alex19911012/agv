package group.agv01.resttemplate;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.asm.Type;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import group.agv01.base.message.map.SegmentMessage;
import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class restTemplateTests {

	@Test
	public void aaaa() {//失败
		try {
        	RestTemplate restTemplate = new RestTemplate();
        	String url="http://192.168.11.135:8080/segment-info/list";
             //String json =restTemplate.getForObject(url,Object.class);
             Integer[] results = restTemplate.getForObject(url, Integer[].class);
             System.err.println("返回数据==="+results);
             for(Integer t : results) {
           	 System.err.println(t);
            }
             
             System.err.println("---------1");
            
            	
             String url2 = "http://192.168.11.135:8080/segment-info/{segmentIds}";
             Integer segmentId1 = 1;
             String result2 = restTemplate.getForObject(url2, String.class,"1");

            // Gson gson = new Gson();
             System.err.println("---------");
             //SegmentMessage s = gson.fromJson(result2, SegmentMessage.class);
             System.err.println("返回数据2==="+result2);
             
             List<SegmentMessage> model = JSON.parseArray(result2, SegmentMessage.class);
             System.err.println(model);
             
           //  System.out.println(s);
             //ParameterizedTypeReference<SegmentMessage> responseBodyType = new ParameterizedTypeReference<SegmentMessage>() {};
             
             // HttpEntity<SegmentMessage> entity = new HttpEntity<>(new SegmentMessage());替代null
             
             System.err.println("--------2");
             ResponseEntity<String> ret = restTemplate.exchange(url2,HttpMethod.GET, null,String.class,segmentId1);
             System.err.println("--------3");
             System.err.println(ret.getBody());
             
//             String url3 = "http://192.168.11.135:8080/segment-info/%s";
//             Integer segmentId2 = 1;
//             ObjectMapper mapper = new ObjectMapper();
//             mapper.readValue(restTemplate.getForObject(url2, SegmentMessage.class),mapper.getTypeFactory().constructParametricType(Object.class,Bean.class));
             
         } catch (Exception e) {
            e.printStackTrace();
        }
	}
	@Test
	public void bbb() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String url = "http://192.168.11.135:8080/segment-info/"+"1";
		HttpGet request = new HttpGet(url);		
		CloseableHttpResponse response = httpClient.execute(request);
		HttpEntity entity = response.getEntity();
		String res = EntityUtils.toString(entity);
		Gson gson = new Gson();
		String json = gson.fromJson(res, String.class);
		System.out.println(json);
		
	}

	

}
