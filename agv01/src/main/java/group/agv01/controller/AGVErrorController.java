package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVError;
import group.agv01.entity.AGVReco;
import group.agv01.entity.AGVServ;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVErrorService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IAGVServService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/agv")
public class AGVErrorController extends BaseController{
	@Autowired
	private IAGVErrorService AGVErrorService;
	
	
	
	@GetMapping("/error")
	public ResponseResult<List<AGVError>> AGVServList() {	
		System.err.println("请求车辆故障列表");
		List<AGVError> data = AGVErrorService.findAGVErrors();
		return new ResponseResult<List<AGVError>>(SUCCESS,data);
	}
	
	
	
}
