package Tests;

import Overriding.CreditCardPayment;
import Overriding.Payments;
import Overriding.payPalPayment;

public class PaymentTest {
	public static void main(String[] args) {
		Payments payment;
		payment = new CreditCardPayment();
		payment.PayBills();
		payment.redeem();

		payment = new payPalPayment();
		payment.PayBills();
		payment.redeem();
	}

}
