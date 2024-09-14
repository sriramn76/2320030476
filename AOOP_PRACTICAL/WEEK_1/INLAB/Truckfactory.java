package INLAB;

public class Truckfactory extends Vehiclefactory{ 
	@Override
	public Vehicle createVehicle() {
		return new Truck();
	}
}
