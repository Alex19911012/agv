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
import group.agv01.service.IMapService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;
import group.agv01.vo.DRT;
import group.agv01.vo.Map;


@RestController
@RequestMapping("/map")
public class MapController extends BaseController{
	@Autowired
	private IMapService MapService;
	
	
	
	@GetMapping("/pathSP")
	public ResponseResult<List<Map>> SPList() {	
		System.err.println("请求Path起点");
		List<Map> data = MapService.findSourPoint();
		return new ResponseResult<List<Map>>(SUCCESS,data);
	}
	
	@GetMapping("/pathDP")
	public ResponseResult<List<Map>> DPList() {	
		System.err.println("请求Path终点数据");
		List<Map> data = MapService.findDestPoint();
		return new ResponseResult<List<Map>>(SUCCESS,data);
	}

	
	
	
}
