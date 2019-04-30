package group.agv01.entity;

import java.io.Serializable;
/**
 * 用户数据的实体类
 * @author Alex
 *
 */
public class Role implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8909612804792310021L;

	private Integer RoleID;
	
	private	String Role;
	
	private String UserName;
	
	private String Func;
	
	private String State;

	public Integer getRoleID() {
		return RoleID;
	}

	public void setRoleID(Integer roleID) {
		RoleID = roleID;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getFunc() {
		return Func;
	}

	public void setFunc(String func) {
		Func = func;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Role [RoleID=" + RoleID + ", Role=" + Role + ", UserName=" + UserName + ", Func=" + Func + ", State="
				+ State + "]";
	}
	
	
	
	
	
		

	
	

	


	
	


}
