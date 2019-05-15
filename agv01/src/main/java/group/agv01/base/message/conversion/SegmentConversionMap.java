package group.agv01.base.message.conversion;

import group.agv01.base.message.map.SegmentMessage;
import group.agv01.vo.Map;

public class SegmentConversionMap {
	public static Map segmentToPath(SegmentMessage segmentMessage) {
		Map map = new Map();
		
		map.setPathID(String.valueOf(segmentMessage.getSegmentId()));
		
		map.setDist(segmentMessage.getLength());
		
		map.setPathType(String.valueOf(segmentMessage.getType()));
		
		map.setAngle(segmentMessage.getRotAngle());
		
		map.setSourPointID(String.valueOf(segmentMessage.getStartNodeId()));
		
		map.setDestPointID(String.valueOf(segmentMessage.getEndNodeId()));
		
		Double PX;
		
		Double PY;				
		
		String PointID;
		
		return map;
	}
	
	public static Map segmentToSourPoint(SegmentMessage segmentMessage) {
		Map map = new Map();
		
		map.setPointID(String.valueOf(segmentMessage.getStartNodeId()));
		
		map.setPX(segmentMessage.getControl1X());
		
		map.setPY(segmentMessage.getControl1Y());
		return map;
		
	}
	
	public static Map segmentToDestPoint(SegmentMessage segmentMessage) {
		Map map = new Map();
		
		map.setPointID(String.valueOf(segmentMessage.getEndNodeId()));
		
		map.setPX(segmentMessage.getControl2X());
		
		map.setPY(segmentMessage.getControl2Y());
		
		return map;
		
	}
}
