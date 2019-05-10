package group.agv01.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RF implements Serializable{
	
	

	
	//RoleID
	String RoleID;
	//FuncID
	String FuncID;
	
	public String getRoleID() {
		return RoleID;
	}
	public void setRoleID(String roleID) {
		RoleID = roleID;
	}
	public String getFuncID() {
		return FuncID;
	}
	public void setFuncID(String funcID) {
		FuncID = funcID;
	}
	
	@Override
	public String toString() {
		return "RF [RoleID=" + RoleID + ", FuncID=" + FuncID + "]";
	}
	
	
	
			
	
	
	
}
