package WEEK_3.POSTLAB;

public class ScooterFactory implements VehicleFactory {
	public Vehicle createVehicle() {
        return new Scooter();
    }
}