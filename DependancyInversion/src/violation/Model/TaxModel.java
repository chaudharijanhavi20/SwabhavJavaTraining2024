package violation.Model;

public class TaxModel {
	private DBlogger dblogger;

	public TaxModel() {

	}

	public int calculateTax(int amount, int rate) {
		return amount / rate;
	}
}
