package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DayWarn implements Serializable{
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1660570052618633660L;

	//日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date SD;

	//导航车ID

	String AGVID;

	//导航车编号

	String AGVNo;

	//警告数量

	Integer Warn;

	//充电警告数量

	Integer CharW;

	//电量警告数量

	Integer PoweW;

	//机械警告数量

	Integer MechW;

	//订单警告数量

	Integer OrdeW;

	//任务警告数量

	Integer TaskW;

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

	public Integer getWarn() {
		return Warn;
	}

	public void setWarn(Integer warn) {
		Warn = warn;
	}

	public Integer getCharW() {
		return CharW;
	}

	public void setCharW(Integer charW) {
		CharW = charW;
	}

	public Integer getPoweW() {
		return PoweW;
	}

	public void setPoweW(Integer poweW) {
		PoweW = poweW;
	}

	public Integer getMechW() {
		return MechW;
	}

	public void setMechW(Integer mechW) {
		MechW = mechW;
	}

	public Integer getOrdeW() {
		return OrdeW;
	}

	public void setOrdeW(Integer ordeW) {
		OrdeW = ordeW;
	}

	public Integer getTaskW() {
		return TaskW;
	}

	public void setTaskW(Integer taskW) {
		TaskW = taskW;
	}

	@Override
	public String toString() {
		return "DayWarn [SD=" + SD + ", AGVID=" + AGVID + ", AGVNo=" + AGVNo + ", Warn=" + Warn + ", CharW=" + CharW
				+ ", PoweW=" + PoweW + ", MechW=" + MechW + ", OrdeW=" + OrdeW + ", TaskW=" + TaskW + "]";
	}
	
	
	
}
