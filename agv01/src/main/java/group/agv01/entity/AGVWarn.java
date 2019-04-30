package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AGVWarn implements Serializable{
	

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2956371423960621748L;
	//预警ID

	String WID;
	
	//订单ID
	String OrderID;
	
	//导航车ID
	String AGVID;

	//预警发生时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date WDate;

	//故障码

	String WCode;

	//故障类型

	String WType;

	//故障级别

	String WLevel;

	//故障说明

	String WDesc;

	//故障原因

	String WCause;

	//电量

	Integer Perc;

	
	//速度

	Double Speed;

	

	//用户ID

	String UserID;



	public String getWID() {
		return WID;
	}



	public void setWID(String wID) {
		WID = wID;
	}



	public String getOrderID() {
		return OrderID;
	}



	public void setOrderID(String orderID) {
		OrderID = orderID;
	}



	public String getAGVID() {
		return AGVID;
	}



	public void setAGVID(String aGVID) {
		AGVID = aGVID;
	}



	public Date getWDate() {
		return WDate;
	}



	public void setWDate(Date wDate) {
		WDate = wDate;
	}



	public String getWCode() {
		return WCode;
	}



	public void setWCode(String wCode) {
		WCode = wCode;
	}



	public String getWType() {
		return WType;
	}



	public void setWType(String wType) {
		WType = wType;
	}



	public String getWLevel() {
		return WLevel;
	}



	public void setWLevel(String wLevel) {
		WLevel = wLevel;
	}



	public String getWDesc() {
		return WDesc;
	}



	public void setWDesc(String wDesc) {
		WDesc = wDesc;
	}



	public String getWCause() {
		return WCause;
	}



	public void setWCause(String wCause) {
		WCause = wCause;
	}



	public Integer getPerc() {
		return Perc;
	}



	public void setPerc(Integer perc) {
		Perc = perc;
	}



	public Double getSpeed() {
		return Speed;
	}



	public void setSpeed(Double speed) {
		Speed = speed;
	}



	public String getUserID() {
		return UserID;
	}



	public void setUserID(String userID) {
		UserID = userID;
	}



	@Override
	public String toString() {
		return "AGVWarn [WID=" + WID + ", OrderID=" + OrderID + ", AGVID=" + AGVID + ", WDate=" + WDate + ", WCode="
				+ WCode + ", WType=" + WType + ", WLevel=" + WLevel + ", WDesc=" + WDesc + ", WCause=" + WCause
				+ ", Perc=" + Perc + ", Speed=" + Speed + ", UserID=" + UserID + "]";
	}


	
		
	
}
