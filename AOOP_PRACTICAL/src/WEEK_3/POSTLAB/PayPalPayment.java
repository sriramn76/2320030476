package WEEK_3.POSTLAB;

public class PayPalPayment implements PaymentMethod {
	public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal..!");
    }
}
