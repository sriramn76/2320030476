package INLAB;


public class Motorcyclefactory extends Vehiclefactory {

	@Override
	public Vehicle createVehicle() {
		return new Motorcycle();
	}
}