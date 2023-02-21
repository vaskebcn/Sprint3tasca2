package sprint3tasca2n1;

public class App {

	public static void main(String[] args) {

		Broker broker = new Broker();

		new EuAgency(broker, 50);
		new UsAgency(broker, 100);

		System.out.println("update stock values");
		broker.stockValue(5);
		broker.stockValue(-7);

	}

}
