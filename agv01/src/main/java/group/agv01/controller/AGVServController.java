package group.agv01.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVError;
import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.AGVServ;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IAGVServService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/agv")
public class AGVServController extends BaseController{
	@Autowired
	private IAGVServService AGVServService;
	
	
	
	@GetMapping("/serv")
	public ResponseResult<List<AGVServ>> AGVServList() {	
		System.err.println("请求车辆维保列表");
		List<AGVServ> data = AGVServService.findAGVServs();
		return new ResponseResult<List<AGVServ>>(SUCCESS,data);
	}
	
	@PostMapping("/addServ")
	public ResponseResult<Void> addServ(AGVServ AGVServ,HttpSession session) {	
		String UserID = getUidFromSession(session).toString();
		AGVServ.setUserID(UserID);
		System.err.println(AGVServ);
		AGVServService.addAGVServ(AGVServ);				
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{AGVID}/listServByID")
	public ResponseResult<List<AGVServ>> listByDate(@PathVariable("AGVID") String AGVID){	
		System.err.println(AGVID);
		List<AGVServ> data = AGVServService.findAGVServsByID(AGVID);
		return new ResponseResult<List<AGVServ>>(SUCCESS,data);
	}

	
	
}
