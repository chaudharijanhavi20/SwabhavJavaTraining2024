package srp.solution.model;

public class InvoicePrinter {
	private invoiceModel invoice;
	private TaxCalculator taxcalci;

	public InvoicePrinter(invoiceModel invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxcalci = taxcalci;
	}

	public void print() {
		System.out.println("id :" + invoice.getId());
		System.out.println("Descriptionn : " + invoice.getDescription());
		System.out.println("amount : " + invoice.getAmount());
		System.out.println("Tax : " + invoice.getTax());
		System.out.println("tax amount :" + taxcalci.calculateTax());
		System.out.println("amount with tax : " + invoice.getAmount() + taxcalci.calculateTax());
	}
	
}
