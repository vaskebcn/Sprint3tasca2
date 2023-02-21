package sprint3tasca2n1;

import java.util.ArrayList;

public class Broker {

	private ArrayList<Agency> agencies = new ArrayList<Agency>();
	private double stockChanges;

	public void stockValue(double stockChanges) {
		this.stockChanges = stockChanges;
		notificateAgencies();
	}

	public void add(Agency a) {
		agencies.add(a);
	}

	public void notificateAgencies() {
		for (Agency agency : agencies) {
			agency.update(stockChanges);
		}
	}

}
