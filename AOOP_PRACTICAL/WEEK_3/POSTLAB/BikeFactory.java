package POSTLAB;

public abstract class BikeFactory implements Vehicle {
	public Vehicle createVehicle() {
        return new Bike();
    }
}