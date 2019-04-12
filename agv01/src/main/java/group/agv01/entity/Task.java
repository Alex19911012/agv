package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Task implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6629080509250998719L;
	String TaskID;//任务ID
	String TaskType;//任务类型

	//级别

	String Grade;

	//起点位置ID

	String SourPosiID;

	//终点位置ID

	String DestPosiID;

	//距离
	
	
	Double Dist;

	//最后期限
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date Deadline;

	//货物名称

	String MateName;

	//货物数量

	String Quan;

	//任务状态

	String TStat;

	//任务创建时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date CreatDate;

	//用户ID

	String UserID;

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}

	public String getTaskType() {
		return TaskType;
	}

	public void setTaskType(String taskType) {
		TaskType = taskType;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
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

	public String getMateName() {
		return MateName;
	}

	public void setMateName(String mateName) {
		MateName = mateName;
	}

	public String getQuan() {
		return Quan;
	}

	public void setQuan(String quan) {
		Quan = quan;
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

	@Override
	public String toString() {
		return "Task [TaskID=" + TaskID + ", TaskType=" + TaskType + ", Grade=" + Grade + ", SourPosiID=" + SourPosiID
				+ ", DestPosiID=" + DestPosiID + ", Dist=" + Dist + ", Deadline=" + Deadline + ", MateName=" + MateName
				+ ", Quan=" + Quan + ", TStat=" + TStat + ", CreatDate=" + CreatDate + ", UserID=" + UserID + "]";
	}
	
	
	
}
