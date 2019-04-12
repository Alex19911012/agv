package group.agv01.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AGVInfo implements Serializable{

	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2665273012757445650L;
	//导航车ID

	String AGVID;

	//导航车编号

	String AGVNo;

	//导航车类型

	String AType;

	//导航车规格

	String ASize;

	//载重

	String LoadCarry;

	//自重

	String Weight;

	//速度

	Double Speed;

	//电池续航时间

	Double BattTime;

	//电池续航距离

	Double BattDist;

	//电池功率

	Double BattPower;

	//导航车IP

	String AGVIP;

	//服务器IP

	String ServerIP;

	//域名

	String DNS;

	//通讯协议接口号

	String Port;

	//导航车RFID

	String AGVRFID;

	//导航车SIM号

	String AGVSIMNo;

	//导航车状态

	String AStat;

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

	public String getAType() {
		return AType;
	}

	public void setAType(String aType) {
		AType = aType;
	}

	public String getASize() {
		return ASize;
	}

	public void setASize(String aSize) {
		ASize = aSize;
	}

	public String getLoadCarry() {
		return LoadCarry;
	}

	public void setLoadCarry(String loadCarry) {
		LoadCarry = loadCarry;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public Double getSpeed() {
		return Speed;
	}

	public void setSpeed(Double speed) {
		Speed = speed;
	}

	public Double getBattTime() {
		return BattTime;
	}

	public void setBattTime(Double battTime) {
		BattTime = battTime;
	}

	public Double getBattDist() {
		return BattDist;
	}

	public void setBattDist(Double battDist) {
		BattDist = battDist;
	}

	public Double getBattPower() {
		return BattPower;
	}

	public void setBattPower(Double battPower) {
		BattPower = battPower;
	}

	public String getAGVIP() {
		return AGVIP;
	}

	public void setAGVIP(String aGVIP) {
		AGVIP = aGVIP;
	}

	public String getServerIP() {
		return ServerIP;
	}

	public void setServerIP(String serverIP) {
		ServerIP = serverIP;
	}

	public String getDNS() {
		return DNS;
	}

	public void setDNS(String dNS) {
		DNS = dNS;
	}

	public String getPort() {
		return Port;
	}

	public void setPort(String port) {
		Port = port;
	}

	public String getAGVRFID() {
		return AGVRFID;
	}

	public void setAGVRFID(String aGVRFID) {
		AGVRFID = aGVRFID;
	}

	public String getAGVSIMNo() {
		return AGVSIMNo;
	}

	public void setAGVSIMNo(String aGVSIMNo) {
		AGVSIMNo = aGVSIMNo;
	}

	public String getAStat() {
		return AStat;
	}

	public void setAStat(String aStat) {
		AStat = aStat;
	}

	@Override
	public String toString() {
		return "AGVInfo [AGVID=" + AGVID + ", AGVNo=" + AGVNo + ", AType=" + AType + ", ASize=" + ASize + ", LoadCarry="
				+ LoadCarry + ", Weight=" + Weight + ", Speed=" + Speed + ", BattTime=" + BattTime + ", BattDist="
				+ BattDist + ", BattPower=" + BattPower + ", AGVIP=" + AGVIP + ", ServerIP=" + ServerIP + ", DNS=" + DNS
				+ ", Port=" + Port + ", AGVRFID=" + AGVRFID + ", AGVSIMNo=" + AGVSIMNo + ", AStat=" + AStat + "]";
	}
			
	
}
