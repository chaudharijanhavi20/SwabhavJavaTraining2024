package Solution.Test;

import Solution.Model.Dblogger;
import Solution.Model.Filelogger;
import Solution.Model.TaxModel;

public class TaxTest {
	public static void main(String[] args) {
		TaxModel tax = new TaxModel(new Dblogger());
		tax.calculateTax(2000, 0);

		TaxModel tax2 = new TaxModel(new Filelogger());
		tax.calculateTax(4000, 0);

	}
}
