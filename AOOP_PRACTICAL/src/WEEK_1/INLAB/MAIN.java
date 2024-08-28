package WEEK_1.INLAB;

public class MAIN {
	public static void main(String[] args) {
		Vehiclefactory obj = new Carfactory();
		Vehiclefactory obj1 = new Motorcyclefactory();
		obj.createVehicle();
		obj.driveVehicle();
        obj1.createVehicle();
        obj1.driveVehicle();
        Vehiclefactory obj2 = new Truckfactory();
        obj2.createVehicle();
		obj2.driveVehicle();
	}
}
