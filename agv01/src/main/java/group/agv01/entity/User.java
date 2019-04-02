package group.agv01.entity;

import java.io.Serializable;
/**
 * 用户数据的实体类
 * @author Alex
 *
 */
public class User implements Serializable{

	private static final long serialVersionUID = -4268591726677729193L;
	
	private	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	


}
