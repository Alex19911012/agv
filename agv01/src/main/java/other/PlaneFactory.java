package other;

public class PlaneFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return new Plane();
	}
	
	

}
