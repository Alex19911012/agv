package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

public class OAGVT implements Serializable{
	//任务订单车ID

	/**
	 * 
	 */
	private static final long serialVersionUID = -7293615763685880075L;

	String OAGVTID;

	//导航车ID

	String AGVID;

	//导航车编号

	String AGVNo;

	//任务ID

	String TaskID;

	//订单ID

	String OrderID;

	//起点位置ID

	String SourPosiID;

	//终点位置ID

	String DestPosiID;

	//距离

	double Dist;

	//最后期限

	Date Deadline;

	//级别

	String Grade;

	//订单状态

	String OStat;

	//任务状态

	String TStat;

	//开始时间

	Date BeginTime;

	//完成时间

	Date EndTime;

	//货物名称

	String MateName;

	//货物数量

	double Quan;

	public String getOAGVTID() {
		return OAGVTID;
	}

	public void setOAGVTID(String oAGVTID) {
		OAGVTID = oAGVTID;
	}

	public String getAGVID() {
		return AGVID;
	}

	public void setAGVID(String aGVID) {
		AGVID = aGVID;
	}

	public String getAGVNo() {
		return AGVNo;
	}

	public void setAGVNo(String aGVNo) {
		AGVNo = aGVNo;
	}

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}

	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
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

	public double getDist() {
		return Dist;
	}

	public void setDist(double dist) {
		Dist = dist;
	}

	public Date getDeadline() {
		return Deadline;
	}

	public void setDeadline(Date deadline) {
		Deadline = deadline;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getOStat() {
		return OStat;
	}

	public void setOStat(String oStat) {
		OStat = oStat;
	}

	public String getTStat() {
		return TStat;
	}

	public void setTStat(String tStat) {
		TStat = tStat;
	}

	public Date getBeginTime() {
		return BeginTime;
	}

	public void setBeginTime(Date beginTime) {
		BeginTime = beginTime;
	}

	public Date getEndTime() {
		return EndTime;
	}

	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}

	public String getMateName() {
		return MateName;
	}

	public void setMateName(String mateName) {
		MateName = mateName;
	}

	public double getQuan() {
		return Quan;
	}

	public void setQuan(double quan) {
		Quan = quan;
	}

	@Override
	public String toString() {
		return "OAGVT [OAGVTID=" + OAGVTID + ", AGVID=" + AGVID + ", AGVNo=" + AGVNo + ", TaskID=" + TaskID
				+ ", OrderID=" + OrderID + ", SourPosiID=" + SourPosiID + ", DestPosiID=" + DestPosiID + ", Dist="
				+ Dist + ", Deadline=" + Deadline + ", Grade=" + Grade + ", OStat=" + OStat + ", TStat=" + TStat
				+ ", BeginTime=" + BeginTime + ", EndTime=" + EndTime + ", MateName=" + MateName + ", Quan=" + Quan
				+ "]";
	}
	
	
}
