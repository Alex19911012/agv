package group.agv01.entity;

import java.io.Serializable;
/**
 * 用户数据的实体类
 * @author Alex
 *
 */
public class Func implements Serializable{

	
	private Integer FuncID;
	
	private	String Func;
	
	private String State;

	public Integer getFuncID() {
		return FuncID;
	}

	public void setFuncID(Integer funcID) {
		FuncID = funcID;
	}

	public String getFunc() {
		return Func;
	}

	public void setFunc(String func) {
		Func = func;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Func [FuncID=" + FuncID + ", Func=" + Func + ", State=" + State + "]";
	}
	
	
			

	
	

	


	
	


}
