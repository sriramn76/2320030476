package WEEK_3.POSTLAB;

public class CreditCardFactory  implements PaymentMethodFactory {
	public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}