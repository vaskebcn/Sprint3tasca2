package sprint3Tasca2n2;

public class CardPayment implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Card payment accepted");
	}
	
	

}
