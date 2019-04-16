package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DayWorkOrder implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3397366222401905593L;

	//日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date SD;

	//导航车ID

	String AGVID;

	//导航车编号

	String AGVNo;

	//完成订单数量

	Integer OrderOK;

	//超时订单数量

	Integer OrderTimeout;

	//取消订单

	Integer OrderNotOk;

	//空驶订单数量

	Integer OrderE;

	//运货订单数量

	Integer OrderF;

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

	public Integer getOrderOK() {
		return OrderOK;
	}

	public void setOrderOK(Integer orderOK) {
		OrderOK = orderOK;
	}

	public Integer getOrderTimeout() {
		return OrderTimeout;
	}

	public void setOrderTimeout(Integer orderTimeout) {
		OrderTimeout = orderTimeout;
	}

	public Integer getOrderNotOk() {
		return OrderNotOk;
	}

	public void setOrderNotOk(Integer orderNotOk) {
		OrderNotOk = orderNotOk;
	}

	public Integer getOrderE() {
		return OrderE;
	}

	public void setOrderE(Integer orderE) {
		OrderE = orderE;
	}

	public Integer getOrderF() {
		return OrderF;
	}

	public void setOrderF(Integer orderF) {
		OrderF = orderF;
	}

	@Override
	public String toString() {
		return "DayWorkOrder [SD=" + SD + ", AGVID=" + AGVID + ", AGVNo=" + AGVNo + ", OrderOK=" + OrderOK
				+ ", OrderTimeout=" + OrderTimeout + ", OrderNotOk=" + OrderNotOk + ", OrderE=" + OrderE + ", OrderF="
				+ OrderF + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
