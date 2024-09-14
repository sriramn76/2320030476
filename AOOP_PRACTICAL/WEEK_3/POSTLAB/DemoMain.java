package POSTLAB;

public class DemoMain {

	public static void main(String[] args) {
		UserAuthentication authentication = UserAuthentication.getInstance();
        boolean isAuthenticate = authentication.authenticateUser("username", "password");
        if (isAuthenticate) {
            VehicleFactory carFactory = new ScooterFactory();
            Vehicle car = carFactory.createVehicle();
            car.requestRide();

            //BikeFactory bikeFactory = new BikeFactory();
           // Vehicle bike = bikeFactory.createVehicle();
            //bike.requestRide();

            VehicleFactory scooterFactory = new ScooterFactory();
            Vehicle scooter = scooterFactory.createVehicle();
            scooter.requestRide();

            PaymentMethodFactory creditCardFactory = new CreditCardFactory();
            PaymentMethod creditCardPayment = creditCardFactory.createPaymentMethod();
            creditCardPayment.pay(20.0);

            PaymentMethodFactory payPalFactory = new PayPalFactory();
            PaymentMethod payPalPayment = payPalFactory.createPaymentMethod();
            payPalPayment.pay(15.0);
        } else {
            System.out.println("Authentication failed. Unable to request a ride or make a payment.");
        }
	}

}