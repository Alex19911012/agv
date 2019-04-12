package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVReco;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/agvReco")
public class AGVRecoController extends BaseController{
	@Autowired
	private IAGVRecoService AGVRecoService;
	
	
	
	@GetMapping("/list")
	public ResponseResult<List<AGVReco>> OAGVTList() {	
		System.err.println("请求车辆状态列表");
		List<AGVReco> data = AGVRecoService.findAGVRecos();
		return new ResponseResult<List<AGVReco>>(SUCCESS,data);
	}
	
	
	
}
