package WEEK_1.INLAB;


public class Motorcyclefactory extends Vehiclefactory {

	@Override
	public Vehicle createVehicle() {
		return new Motorcycle();
	}
}