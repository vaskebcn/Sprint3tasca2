package sprint3Tasca2n2;

public class ShoeStore {
	
	private String name;
	private double productPrice;
	
	public ShoeStore(String name, double productPrice) {
		this.name = name;
		this.productPrice = productPrice;
	}

	public String getName() {
		return name;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public void sellingMethod(double productPrice, PaymentMethod paymentMethod) {
		PaymentGateway paymentGateway = new PaymentGateway();
		paymentGateway.pay(productPrice, paymentMethod);
	}
	

	
	
	

}
