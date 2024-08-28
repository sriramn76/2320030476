package WEEK_1.INLAB;

public class Carfactory extends Vehiclefactory{
	@Override
	public Vehicle createVehicle() {
		return new Car();
	}

}
