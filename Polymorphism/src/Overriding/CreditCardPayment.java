package Overriding;

public class CreditCardPayment extends Payments {
	public void PayBills() {
		System.out.println("paybills from credit card payment");
	}

	public void redeem() {
		System.out.println("redeems from credit card payments");
	}
}
