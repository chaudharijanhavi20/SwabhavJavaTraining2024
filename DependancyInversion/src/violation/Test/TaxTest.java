package violation.Test;

import violation.Model.TaxModel;

public class TaxTest {
	public static void main(String[] args) {
		TaxModel tax = new TaxModel();
		tax.calculateTax(100, 10);

		TaxModel tax2 = new TaxModel();
		tax2.calculateTax(400, 20);
	}
}
