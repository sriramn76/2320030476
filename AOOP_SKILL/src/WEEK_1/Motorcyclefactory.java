package WEEK_1;


public class Motorcyclefactory extends Vehiclefactory {

	@Override
	public Vehicle createVehicle() {
		return new Motorcycle();
	}
}