package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DayWorkTime implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5412826671666620862L;

	

	//日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date SD;

	//导航车ID

	String AGVID;

	//导航车编号

	String AGVNo;

	//行驶时间

	Double RunTime;

	//空驶时间

	Double ERunTime;

	//充电时间

	Double CharTime;

	//等待时间

	Double WaitTime;

	//故障时间

	Double ErroTime;

	//维护保养时间

	Double MainTime;

	public Date getSD() {
		return SD;
	}

	public void setSD(Date sD) {
		SD = sD;
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

	public Double getRunTime() {
		return RunTime;
	}

	public void setRunTime(Double runTime) {
		RunTime = runTime;
	}

	public Double getERunTime() {
		return ERunTime;
	}

	public void setERunTime(Double eRunTime) {
		ERunTime = eRunTime;
	}

	public Double getCharTime() {
		return CharTime;
	}

	public void setCharTime(Double charTime) {
		CharTime = charTime;
	}

	public Double getWaitTime() {
		return WaitTime;
	}

	public void setWaitTime(Double waitTime) {
		WaitTime = waitTime;
	}

	public Double getErroTime() {
		return ErroTime;
	}

	public void setErroTime(Double erroTime) {
		ErroTime = erroTime;
	}

	public Double getMainTime() {
		return MainTime;
	}

	public void setMainTime(Double mainTime) {
		MainTime = mainTime;
	}

	@Override
	public String toString() {
		return "DayWorkTime [SD=" + SD + ", AGVID=" + AGVID + ", AGVNo=" + AGVNo + ", RunTime=" + RunTime
				+ ", ERunTime=" + ERunTime + ", CharTime=" + CharTime + ", WaitTime=" + WaitTime + ", ErroTime="
				+ ErroTime + ", MainTime=" + MainTime + "]";
	}
	
	
	
	
	
	
	
	
}
