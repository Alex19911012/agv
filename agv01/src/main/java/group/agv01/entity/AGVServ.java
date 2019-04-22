package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AGVServ implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7258017442059259754L;

	
	//导航车ID
	
	String AGVID;

	//维护保养时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date ServDate;

	//维护保养类型

	String ServType;

	//维护保养项目

	String ServItem;

	//部件名称

	String PartName;

	//行驶距离

	Double RunDist;

	//行驶时间

	Double RunTime;

	//下次维护保养距离

	Double NextDist;

	//下次维护保养时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date NextTime;
	
	String UserID;

	public String getAGVID() {
		return AGVID;
	}

	public void setAGVID(String aGVID) {
		AGVID = aGVID;
	}

	public Date getServDate() {
		return ServDate;
	}

	public void setServDate(Date servDate) {
		ServDate = servDate;
	}

	public String getServType() {
		return ServType;
	}

	public void setServType(String servType) {
		ServType = servType;
	}

	public String getServItem() {
		return ServItem;
	}

	public void setServItem(String servItem) {
		ServItem = servItem;
	}

	public String getPartName() {
		return PartName;
	}

	public void setPartName(String partName) {
		PartName = partName;
	}

	public Double getRunDist() {
		return RunDist;
	}

	public void setRunDist(Double runDist) {
		RunDist = runDist;
	}

	public Double getRunTime() {
		return RunTime;
	}

	public void setRunTime(Double runTime) {
		RunTime = runTime;
	}

	public Double getNextDist() {
		return NextDist;
	}

	public void setNextDist(Double nextDist) {
		NextDist = nextDist;
	}

	public Date getNextTime() {
		return NextTime;
	}

	public void setNextTime(Date nextTime) {
		NextTime = nextTime;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	@Override
	public String toString() {
		return "AGVServ [AGVID=" + AGVID + ", ServDate=" + ServDate + ", ServType=" + ServType + ", ServItem="
				+ ServItem + ", PartName=" + PartName + ", RunDist=" + RunDist + ", RunTime=" + RunTime + ", NextDist="
				+ NextDist + ", NextTime=" + NextTime + ", UserID=" + UserID + "]";
	}

	
	
	
	
}
