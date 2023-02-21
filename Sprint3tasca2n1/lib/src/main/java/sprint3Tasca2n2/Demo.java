package sprint3Tasca2n2;

public class Demo {

	public static void main(String[] args) {
		
		double productPrice = 70;
		String storeName = "shoeStore";
		
		
		ShoeStore store = new ShoeStore(storeName, productPrice);
		
		PaymentMethod paypal = new PayPalPayment();
		PaymentMethod card = new CardPayment();
		PaymentMethod acount = new BankAcountPayment();
		
		
		
		store.sellingMethod(productPrice, paypal);
		store.sellingMethod(productPrice, card);
		store.sellingMethod(productPrice, acount);
		
		
		
		
		
		
		
		

	}

}
