package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DayRunDist implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3603471375785958188L;

	//日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date SD;

	//导航车ID

	String AGVID;

	//导航车编号

	String AGVNo;

	//行驶距离

	Double RunDist;

	//载重行驶距离

	Double FRunDist;

	//空驶行驶距离

	Double ERunDist;

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

	public Double getRunDist() {
		return RunDist;
	}

	public void setRunDist(Double runDist) {
		RunDist = runDist;
	}

	public Double getFRunDist() {
		return FRunDist;
	}

	public void setFRunDist(Double fRunDist) {
		FRunDist = fRunDist;
	}

	public Double getERunDist() {
		return ERunDist;
	}

	public void setERunDist(Double eRunDist) {
		ERunDist = eRunDist;
	}

	@Override
	public String toString() {
		return "DayRunDist [SD=" + SD + ", AGVID=" + AGVID + ", AGVNo=" + AGVNo + ", RunDist=" + RunDist + ", FRunDist="
				+ FRunDist + ", ERunDist=" + ERunDist + "]";
	}
	
	
	
	
	
}
