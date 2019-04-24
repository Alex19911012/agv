package group.agv01.vo;

import java.io.Serializable;

public class Map implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2851854224795869815L;

	String PathID;
	
	Double PX;
	
	Double PY;
	
	String SourPointID;
	
	String DestPointID;

	public String getPathID() {
		return PathID;
	}

	public void setPathID(String pathID) {
		PathID = pathID;
	}

	public Double getPX() {
		return PX;
	}

	public void setPX(Double pX) {
		PX = pX;
	}

	public Double getPY() {
		return PY;
	}

	public void setPY(Double pY) {
		PY = pY;
	}

	public String getSourPointID() {
		return SourPointID;
	}

	public void setSourPointID(String sourPointID) {
		SourPointID = sourPointID;
	}

	public String getDestPointID() {
		return DestPointID;
	}

	public void setDestPointID(String destPointID) {
		DestPointID = destPointID;
	}

	@Override
	public String toString() {
		return "Map [PathID=" + PathID + ", PX=" + PX + ", PY=" + PY + ", SourPointID=" + SourPointID + ", DestPointID="
				+ DestPointID + "]";
	}

	
	
	
	
	
	
}
