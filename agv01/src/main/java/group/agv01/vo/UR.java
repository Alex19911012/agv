package group.agv01.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UR implements Serializable{
	
	
	private static final long serialVersionUID = 6752350584630405515L;

	
	//UserID
	String UserID;
	//RoleID
	String RoleID;
	
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getRoleID() {
		return RoleID;
	}
	public void setRoleID(String roleID) {
		RoleID = roleID;
	}
	@Override
	public String toString() {
		return "UR [UserID=" + UserID + ", RoleID=" + RoleID + "]";
	}
		
	
	
	
}
