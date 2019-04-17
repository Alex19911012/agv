package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.DayError;
import group.agv01.entity.DayWarn;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IDayErrorService;
import group.agv01.service.IDayWarnService;
import group.agv01.service.IDayWorkOrderService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/day")
public class DayWarnController extends BaseController{
	@Autowired
	private IDayWarnService DayWarnService;
	
	
	
	@GetMapping("/warn")
	public ResponseResult<List<DayWarn>> OAGVTList() {	
		System.err.println("请求日预警数量");
		List<DayWarn> data = DayWarnService.findDayWarns();
		return new ResponseResult<List<DayWarn>>(SUCCESS,data);
	}
	
	
	
}
