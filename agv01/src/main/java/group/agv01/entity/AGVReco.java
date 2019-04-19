package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AGVReco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7293615763685880075L;

			//导航车ID
			
			String	AGVID;
			
			//导航车监控时间点
			@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
			Date ATime;
			
			//导航车编号
			
			String AGVNo;
			
			//速度
			
			Double Speed;
			
			
			
						
			//电量
			
			Integer perc;
			
			
			//导航车状态
			
			String AStat;
			
			//位置ID
			
			String PosiID;
			
			//订单ID
			String OID;

			public String getAGVID() {
				return AGVID;
			}

			public void setAGVID(String aGVID) {
				AGVID = aGVID;
			}

			public Date getATime() {
				return ATime;
			}

			public void setATime(Date aTime) {
				ATime = aTime;
			}

			public String getAGVNo() {
				return AGVNo;
			}

			public void setAGVNo(String aGVNo) {
				AGVNo = aGVNo;
			}

			public Double getSpeed() {
				return Speed;
			}

			public void setSpeed(Double speed) {
				Speed = speed;
			}

			public Integer getPerc() {
				return perc;
			}

			public void setPerc(Integer perc) {
				this.perc = perc;
			}

			public String getAStat() {
				return AStat;
			}

			public void setAStat(String aStat) {
				AStat = aStat;
			}

			public String getPosiID() {
				return PosiID;
			}

			public void setPosiID(String posiID) {
				PosiID = posiID;
			}

			public String getOID() {
				return OID;
			}

			public void setOID(String oID) {
				OID = oID;
			}

			@Override
			public String toString() {
				return "AGVReco [AGVID=" + AGVID + ", ATime=" + ATime + ", AGVNo=" + AGVNo + ", Speed=" + Speed
						+ ", perc=" + perc + ", AStat=" + AStat + ", PosiID=" + PosiID + ", OID=" + OID + "]";
			}

			
				
			
	
}
