package sprint3Tasca2n2;

public class PaymentGateway {

	public void pay(double price, PaymentMethod paymentMethod) {
		paymentMethod.pay(price);
	}
	
}
