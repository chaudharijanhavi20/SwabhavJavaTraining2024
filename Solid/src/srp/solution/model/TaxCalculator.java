package srp.solution.model;

public class TaxCalculator {
	private invoiceModel invoice;

	public TaxCalculator(invoiceModel invoice) {
		super();
		this.invoice = invoice;
	}

	public double calculateTax() {
		return invoice.getAmount() * invoice.getTax() / 100;
	}
}
