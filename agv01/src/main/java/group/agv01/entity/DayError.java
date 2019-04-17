package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DayError implements Serializable{
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2471404416290587147L;

	//日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	Date SD;

	//导航车ID

	String AGVID;

	//导航车编号

	String AGVNo;

	//故障数量

	Integer Erro;

	//机械故障数量

	Integer MechE;

	//电故障数量

	Integer PoweE;

	//网络故障数量

	Integer NetE;

	//操作故障数量

	Integer OperE;

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

	public Integer getErro() {
		return Erro;
	}

	public void setErro(Integer erro) {
		Erro = erro;
	}

	public Integer getMechE() {
		return MechE;
	}

	public void setMechE(Integer mechE) {
		MechE = mechE;
	}

	public Integer getPoweE() {
		return PoweE;
	}

	public void setPoweE(Integer poweE) {
		PoweE = poweE;
	}

	public Integer getNetE() {
		return NetE;
	}

	public void setNetE(Integer netE) {
		NetE = netE;
	}

	public Integer getOperE() {
		return OperE;
	}

	public void setOperE(Integer operE) {
		OperE = operE;
	}

	@Override
	public String toString() {
		return "DayError [SD=" + SD + ", AGVID=" + AGVID + ", AGVNo=" + AGVNo + ", Erro=" + Erro + ", MechE=" + MechE
				+ ", PoweE=" + PoweE + ", NetE=" + NetE + ", OperE=" + OperE + "]";
	}
	
	
	
}
