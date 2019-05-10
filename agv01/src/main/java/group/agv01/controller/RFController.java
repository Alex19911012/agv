package group.agv01.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import group.agv01.entity.Order;
import group.agv01.entity.Role;
import group.agv01.entity.Task;
import group.agv01.entity.User;
import group.agv01.service.IRFService;
import group.agv01.service.IRoleService;
import group.agv01.service.IURService;
import group.agv01.service.IUserService;
import group.agv01.util.ResponseResult;
import group.agv01.vo.RF;
import group.agv01.vo.UR;


@RestController
@RequestMapping("/rf")
public class RFController extends BaseController{
	@Autowired
	private IRFService rfService;
	
	@PostMapping("/{rID}&{fID}/change")
	public ResponseResult<Void> reg(@PathVariable("rID") String RoleID,@PathVariable("fID") String FuncIDs) {	
		System.out.println(RoleID);
		System.out.println(FuncIDs);
		String[] FuncID = FuncIDs.split(",");
		System.out.println(FuncID);
		rfService.moveRF(RoleID);
		RF rf = new RF();
		for(int i=0;i<FuncID.length;i++) {
			rf.setRoleID(RoleID);
			rf.setFuncID(FuncID[i]);
			rfService.addRF(rf);
		}
		
		return new ResponseResult<Void>(SUCCESS);
	}
	
	
	
	
	
	

		
}
