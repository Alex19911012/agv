package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.DayRunDist;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IDayRunDistService;
import group.agv01.service.IDayWorkOrderService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/day")
public class DayRunDistController extends BaseController{
	@Autowired
	private IDayRunDistService DayRunDistService;
	
	
	
	@GetMapping("/runDist")
	public ResponseResult<List<DayRunDist>> OAGVTList() {	
		System.err.println("请求日行驶距离");
		List<DayRunDist> data = DayRunDistService.findDayRunDists();
		return new ResponseResult<List<DayRunDist>>(SUCCESS,data);
	}
	
	
	
}
