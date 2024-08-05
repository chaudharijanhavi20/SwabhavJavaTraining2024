package Tests;

import Models.AccountType;
import Models.BankDetails;

public class BankDetailsTest {
	public static void main(String[] args) {
		BankDetails account = new BankDetails(1233, "janhavi", 45000, AccountType.savings);
		System.out.println(account);
	}

}
