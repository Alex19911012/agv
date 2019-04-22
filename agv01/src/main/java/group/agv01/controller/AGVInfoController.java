package group.agv01.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.AGVInfo;
import group.agv01.entity.AGVReco;
import group.agv01.entity.Order;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IAGVInfoService;
import group.agv01.service.IAGVRecoService;
import group.agv01.service.IOrderService;
import group.agv01.service.ITaskService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;


@RestController
@RequestMapping("/agv")
public class AGVInfoController extends BaseController{
	@Autowired
	private IAGVInfoService AGVInfoService;
	
	
	
	@GetMapping("/info")
	public ResponseResult<List<AGVInfo>> AGVInfoList() {	
		System.err.println("请求AGV基本信息列表");
		List<AGVInfo> data = AGVInfoService.findAGVInfos();
		return new ResponseResult<List<AGVInfo>>(SUCCESS,data);
	}
	
	@PostMapping("/add")
	public ResponseResult<Void> addAGVInfo(AGVInfo AGVInfo,HttpSession session) {	
		String UserID = getUidFromSession(session).toString();
		AGVInfo.setIsDelete(0);
		System.err.println(AGVInfo);
		AGVInfoService.addAGVInfo(AGVInfo);				
		return new ResponseResult<Void>(SUCCESS);
	}
	
	@PostMapping("/{AGVID}/delete")
	public ResponseResult<Void> delete(@PathVariable("AGVID")String AGVID){
		System.err.println(AGVID);
		AGVInfoService.delete(AGVID);
		return new ResponseResult<Void>(SUCCESS);
	}
	
}
