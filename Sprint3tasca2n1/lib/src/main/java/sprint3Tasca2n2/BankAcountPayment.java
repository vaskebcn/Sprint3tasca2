package sprint3Tasca2n2;

public class BankAcountPayment implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Bankacount payment accepted.");
	}

}
