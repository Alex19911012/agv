package group.agv01.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVError;
import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.AGVServ;
import group.agv01.entity.AGVWarn;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVErrorService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IAGVServService;
import group.agv01.service.IAGVWarnService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/agv")
public class AGVWarnController extends BaseController{
	@Autowired
	private IAGVWarnService AGVWarnService;
	
	
	
	@GetMapping("/warnDesc")
	public ResponseResult<List<AGVWarn>> AGVErrorList() {	
		System.err.println("请求车辆预警列表");
		List<AGVWarn> data = AGVWarnService.findAGVWarns();
		return new ResponseResult<List<AGVWarn>>(SUCCESS,data);
	}
	
		
	
}
