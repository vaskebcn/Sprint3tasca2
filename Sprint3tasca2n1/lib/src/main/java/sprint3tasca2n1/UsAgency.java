package sprint3tasca2n1;

public class UsAgency extends Agency {

	private double valueConverter = 1.2;
	private double stockValue;

	public UsAgency(Broker broker, double stockValue) {
		this.broker = broker;
		this.broker.add(this);
		this.stockValue = stockValue;
	}

	public double getValueConverter() {
		return valueConverter;
	}

	public double getStockValue() {
		return stockValue;
	}

	public void setValueConverter(double valueConverter) {
		this.valueConverter = valueConverter;
	}

	public void setStockValue(double stockValue) {
		this.stockValue = stockValue;
	}

	@Override
	public void update(double perC) {
		stockValue += (stockValue / 100 * perC);
		System.out.println("stockValue for US Agency is " + stockValue * valueConverter + " $, and its up to date");
	}

}
