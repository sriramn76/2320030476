package WEEK_1;

public class Truckfactory extends Vehiclefactory{ 
	@Override
	public Vehicle createVehicle() {
		return new Truck();
	}
}
