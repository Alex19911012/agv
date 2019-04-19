package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8236847024661594458L;

	//订单ID
	String OrderID;

	//级别

	String Grade;

	//订单编号

	String ONO;

	//订单类型

	String OType;

	//订单创建时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date ODate;

	//起点位置ID

	String SourPosiID;

	//终点位置ID

	String DestPosiID;

	//最后期限
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date Deadline;

	//任务状态

	String TStat;

	//任务创建时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date CreatDate;

	//用户ID

	String UserID;

	//距离

	Double Dist;

	//订单状态

	String OStat;
	
	String TID;
	
	String AGVID;
	
	Integer IsDelete;

	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getONO() {
		return ONO;
	}

	public void setONO(String oNO) {
		ONO = oNO;
	}

	public String getOType() {
		return OType;
	}

	public void setOType(String oType) {
		OType = oType;
	}

	public Date getODate() {
		return ODate;
	}

	public void setODate(Date oDate) {
		ODate = oDate;
	}

	public String getSourPosiID() {
		return SourPosiID;
	}

	public void setSourPosiID(String sourPosiID) {
		SourPosiID = sourPosiID;
	}

	public String getDestPosiID() {
		return DestPosiID;
	}

	public void setDestPosiID(String destPosiID) {
		DestPosiID = destPosiID;
	}

	public Date getDeadline() {
		return Deadline;
	}

	public void setDeadline(Date deadline) {
		Deadline = deadline;
	}

	public String getTStat() {
		return TStat;
	}

	public void setTStat(String tStat) {
		TStat = tStat;
	}

	public Date getCreatDate() {
		return CreatDate;
	}

	public void setCreatDate(Date creatDate) {
		CreatDate = creatDate;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public Double getDist() {
		return Dist;
	}

	public void setDist(Double dist) {
		Dist = dist;
	}

	public String getOStat() {
		return OStat;
	}

	public void setOStat(String oStat) {
		OStat = oStat;
	}

	public String getTID() {
		return TID;
	}

	public void setTID(String tID) {
		TID = tID;
	}

	public String getAGVID() {
		return AGVID;
	}

	public void setAGVID(String aGVID) {
		AGVID = aGVID;
	}

	public Integer getIsDelete() {
		return IsDelete;
	}

	public void setIsDelete(Integer isDelete) {
		IsDelete = isDelete;
	}

	@Override
	public String toString() {
		return "Order [OrderID=" + OrderID + ", Grade=" + Grade + ", ONO=" + ONO + ", OType=" + OType + ", ODate="
				+ ODate + ", SourPosiID=" + SourPosiID + ", DestPosiID=" + DestPosiID + ", Deadline=" + Deadline
				+ ", TStat=" + TStat + ", CreatDate=" + CreatDate + ", UserID=" + UserID + ", Dist=" + Dist + ", OStat="
				+ OStat + ", TID=" + TID + ", AGVID=" + AGVID + ", IsDelete=" + IsDelete + "]";
	}

	
		
	
}
