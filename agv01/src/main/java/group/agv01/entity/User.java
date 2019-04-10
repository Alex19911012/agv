package group.agv01.entity;

import java.io.Serializable;
/**
 * 用户数据的实体类
 * @author Alex
 *
 */
public class User implements Serializable{

	private static final long serialVersionUID = -4268591726677729193L;
	
	private Integer UserID;
	
	private	String UserName;
	
	private String PW;

	public Integer getUserID() {
		return UserID;
	}

	public void setUserID(Integer userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	@Override
	public String toString() {
		return "User [UserID=" + UserID + ", UserName=" + UserName + ", PW=" + PW + "]";
	}

	

	


	
	


}
