package srp.violation.model;

public class InvoiceModel {
private String id;
private String description;
private double amount;
private double tax;
public InvoiceModel(String id, String description, double amount, double tax) {
	super();
	this.id = id;
	this.description = description;
	this.amount = amount;
	this.tax = tax;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}

public double TaxCalculator() {
	return amount*tax/100;
}
public void print() {
	System.out.println("id :"+id);
	System.out.println("Description :"+description);
	System.out.println("Amount :"+amount);
	System.out.println("tax : "+tax);
	System.out.println("tax amount :"+TaxCalculator());
	System.out.println("total amount with tax :"+amount+TaxCalculator());
	
}
}
