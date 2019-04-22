package group.agv01.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DRT implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 71504695884347743L;
	
	//ID
	
	String DRTID;
	//日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date SD;
	
	//起点ID
	String SourPointID;
	
	//终点ID
	String EndPointID;
	
	//时间片ID
	String TimeSegeID;
	
	//时间片开始时间
	String StartTime;
	
	//时间片结束时间
	String EndTime;
	
	//数量
	Integer Quant;

	
	public String getDRTID() {
		return DRTID;
	}

	public void setDRTID(String dRTID) {
		DRTID = dRTID;
	}

	public Date getSD() {
		return SD;
	}

	public void setSD(Date sD) {
		SD = sD;
	}

	public String getSourPointID() {
		return SourPointID;
	}

	public void setSourPointID(String sourPointID) {
		SourPointID = sourPointID;
	}

	public String getEndPointID() {
		return EndPointID;
	}

	public void setEndPointID(String endPointID) {
		EndPointID = endPointID;
	}

	public String getTimeSegeID() {
		return TimeSegeID;
	}

	public void setTimeSegeID(String timeSegeID) {
		TimeSegeID = timeSegeID;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public Integer getQuant() {
		return Quant;
	}

	public void setQuant(Integer quant) {
		Quant = quant;
	}

	
	
	@Override
	public String toString() {
		return "DRT [DRTID=" + DRTID + ", SD=" + SD + ", SourPointID=" + SourPointID + ", EndPointID=" + EndPointID
				+ ", TimeSegeID=" + TimeSegeID + ", StartTime=" + StartTime + ", EndTime=" + EndTime + ", Quant="
				+ Quant + "]";
	}
	
	
	
	
}
