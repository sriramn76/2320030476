package WEEK_3.POSTLAB;

public class PayPalFactory implements PaymentMethodFactory {
	public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}