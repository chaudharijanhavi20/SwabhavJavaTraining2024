package Overriding;

public class payPalPayment extends Payments {

	public void PayBills() {
		System.out.println("Paybill from pay pal payments");
	}

	public void redeem() {
		System.out.println("redeems from pay pal payments");
	}
}
