package sprint3tasca2n1;

public class EuAgency extends Agency {

	private double stockValue;

	public EuAgency(Broker broker, double stockValue) {
		this.broker = broker;
		this.broker.add(this);
		this.stockValue = stockValue;
	}

	public double getStockValue() {
		return stockValue;
	}

	public void setStockValue(double stockValue) {
		this.stockValue = stockValue;
	}

	@Override
	public void update(double perC) {
		stockValue += (stockValue / 100 * perC);
		System.out.println("stockValue for Eu Agency is " + stockValue + " € and its up to date");
	}

}
