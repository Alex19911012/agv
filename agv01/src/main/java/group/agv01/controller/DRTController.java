package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.DayWorkTime;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IDRTService;
import group.agv01.service.IDayWorkOrderService;
import group.agv01.service.IDayWorkTimeService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;
import group.agv01.vo.DRT;


@RestController
@RequestMapping("/DRT")
public class DRTController extends BaseController{
	@Autowired
	private IDRTService DRTService;
	
	
	
	@GetMapping("/list")
	public ResponseResult<List<DRT>> DRTList() {	
		System.err.println("请求高低峰统计");
		List<DRT> data = DRTService.findDRTs();
		return new ResponseResult<List<DRT>>(SUCCESS,data);
	}
	
	
	
}
