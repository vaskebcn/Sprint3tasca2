package sprint3Tasca2n2;

public class PayPalPayment implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Paypal payment accepted");
	}

}
