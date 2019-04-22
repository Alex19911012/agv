package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AGVError implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5801008033141752393L;


	
	//故障ID

	String EID;

	//导航车ID

	String AGVID;

	//故障发生时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date EDate;

	//故障码

	String ECode;

	//故障类型

	String EType;

	//故障级别

	String ELevel;

	//故障说明

	String EDesc;

	//故障原因

	String ECause;

	//速度

	Double Speed;

	//电量

	Integer Perc;


	//用户ID

	String UserID;


	public String getEID() {
		return EID;
	}


	public void setEID(String eID) {
		EID = eID;
	}


	public String getAGVID() {
		return AGVID;
	}


	public void setAGVID(String aGVID) {
		AGVID = aGVID;
	}


	public Date getEDate() {
		return EDate;
	}


	public void setEDate(Date eDate) {
		EDate = eDate;
	}


	public String getECode() {
		return ECode;
	}


	public void setECode(String eCode) {
		ECode = eCode;
	}


	public String getEType() {
		return EType;
	}


	public void setEType(String eType) {
		EType = eType;
	}


	public String getELevel() {
		return ELevel;
	}


	public void setELevel(String eLevel) {
		ELevel = eLevel;
	}


	public String getEDesc() {
		return EDesc;
	}


	public void setEDesc(String eDesc) {
		EDesc = eDesc;
	}


	public String getECause() {
		return ECause;
	}


	public void setECause(String eCause) {
		ECause = eCause;
	}


	public Double getSpeed() {
		return Speed;
	}


	public void setSpeed(Double speed) {
		Speed = speed;
	}


	public Integer getPerc() {
		return Perc;
	}


	public void setPerc(Integer perc) {
		Perc = perc;
	}


	public String getUserID() {
		return UserID;
	}


	public void setUserID(String userID) {
		UserID = userID;
	}


	@Override
	public String toString() {
		return "AGVError [EID=" + EID + ", AGVID=" + AGVID + ", EDate=" + EDate + ", ECode=" + ECode + ", EType="
				+ EType + ", ELevel=" + ELevel + ", EDesc=" + EDesc + ", ECause=" + ECause + ", Speed=" + Speed
				+ ", Perc=" + Perc + ", UserID=" + UserID + "]";
	}

		
	
}
