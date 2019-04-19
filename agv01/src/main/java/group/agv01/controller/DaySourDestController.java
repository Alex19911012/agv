package group.agv01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.DaySourDest;
import group.agv01.entity.DayWorkOrder;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IDaySourDestService;
import group.agv01.service.IDayWorkOrderService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/day")
public class DaySourDestController extends BaseController{
	@Autowired
	private IDaySourDestService DaySourDestService;
	
	
	
	@GetMapping("/sourDest")
	public ResponseResult<List<DaySourDest>> OAGVTList() {	
		System.err.println("请求日起止路线数量");
		List<DaySourDest> data = DaySourDestService.findDaySourDests();
		return new ResponseResult<List<DaySourDest>>(SUCCESS,data);
	}
	
	
	
}
