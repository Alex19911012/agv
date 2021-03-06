package group.agv01.vo;

import java.io.Serializable;
/**
 * 地图VO类,涉及point和path
 * @author shuangjiaxu
 *
 */
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
	
	Double Dist;
	
	String PathType;
	
	Double Angle;
	
	String PointID;

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

	public Double getDist() {
		return Dist;
	}

	public void setDist(Double dist) {
		Dist = dist;
	}

	public String getPathType() {
		return PathType;
	}

	public void setPathType(String pathType) {
		PathType = pathType;
	}

	public Double getAngle() {
		return Angle;
	}

	public void setAngle(Double angle) {
		Angle = angle;
	}

	public String getPointID() {
		return PointID;
	}

	public void setPointID(String pointID) {
		PointID = pointID;
	}

	@Override
	public String toString() {
		return "Map [PathID=" + PathID + ", PX=" + PX + ", PY=" + PY + ", SourPointID=" + SourPointID + ", DestPointID="
				+ DestPointID + ", Dist=" + Dist + ", PathType=" + PathType + ", Angle=" + Angle + ", PointID="
				+ PointID + "]";
	}

	

	
	
	
	
	
	
}
