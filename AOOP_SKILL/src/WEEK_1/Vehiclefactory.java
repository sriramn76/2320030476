package WEEK_1;

public abstract class Vehiclefactory {
	public abstract Vehicle createVehicle();
	public void driveVehicle() {
		Vehicle vehicleobj = createVehicle();
		vehicleobj.drive();
	}
}
