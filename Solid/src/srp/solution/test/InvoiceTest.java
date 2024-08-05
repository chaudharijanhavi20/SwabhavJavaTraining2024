package srp.solution.test;

import srp.solution.model.InvoicePrinter;
import srp.solution.model.TaxCalculator;
import srp.solution.model.invoiceModel;

public class InvoiceTest {
	public static void main(String[] args) {
		invoiceModel invoice = new invoiceModel("first", "mobile", 40000, 10);

		TaxCalculator taxCalculator = new TaxCalculator(invoice);

		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);
		System.out.println(invoicePrinter);
		System.out.println("id :" + invoice.getId());
		System.out.println("Description : " + invoice.getDescription());
		System.out.println("amount : " + invoice.getAmount());
		System.out.println("Tax : " + invoice.getTax());

		System.out.println("Tax amount :" + taxCalculator.calculateTax());
		System.out.println("Amount with tax : " + (invoice.getAmount() + taxCalculator.calculateTax()));
	}
}
