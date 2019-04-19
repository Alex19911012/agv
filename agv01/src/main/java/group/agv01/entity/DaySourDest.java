package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DaySourDest implements Serializable{
	

	//日期

	/**
	 * 
	 */
	private static final long serialVersionUID = 3373322610897039623L;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date SD;

	//起点位置ID

	String SourPosiID;

	//终点位置ID

	String DestPosiID;

	//空/重

	String EF;

	//数量

	Integer Amount;

	//平均距离

	Double AverDist;

	//平均速度

	Double AverSpeed;

	//平均耗时

	Double AverTime;

	public Date getSD() {
		return SD;
	}

	public void setSD(Date sD) {
		SD = sD;
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

	public String getEF() {
		return EF;
	}

	public void setEF(String eF) {
		EF = eF;
	}

	public Integer getAmount() {
		return Amount;
	}

	public void setAmount(Integer amount) {
		Amount = amount;
	}

	public Double getAverDist() {
		return AverDist;
	}

	public void setAverDist(Double averDist) {
		AverDist = averDist;
	}

	public Double getAverSpeed() {
		return AverSpeed;
	}

	public void setAverSpeed(Double averSpeed) {
		AverSpeed = averSpeed;
	}

	public Double getAverTime() {
		return AverTime;
	}

	public void setAverTime(Double averTime) {
		AverTime = averTime;
	}

	@Override
	public String toString() {
		return "DaySourDest [SD=" + SD + ", SourPosiID=" + SourPosiID + ", DestPosiID=" + DestPosiID + ", EF=" + EF
				+ ", Amount=" + Amount + ", AverDist=" + AverDist + ", AverSpeed=" + AverSpeed + ", AverTime="
				+ AverTime + "]";
	}
	
	
	
	
	
	
	
	
	
}
