package srp.violation.test;

import srp.violation.model.InvoiceModel;

public class InvoiceTest {
public static void main(String[] args) {
	InvoiceModel invoice=new InvoiceModel("first","mobile",50000,10);
	invoice.print();
}
}
