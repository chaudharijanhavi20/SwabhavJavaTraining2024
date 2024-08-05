package Models;

import Exception.InsufficientFundsException;

public class SavingAccount extends Account {
	 private final double MIN_BALANCE = 1000;

	    public SavingAccount(String accNo, String name, double balance) {
	        super(accNo, name, balance);
	    }

	    @Override
	    public void withdraw(double amount) throws InsufficientFundsException {
	        if (balance - amount >= MIN_BALANCE) {
	            balance -= amount;
	            System.out.println("Amount " + amount + " withdrawn successfully.");
	        } else {
	            throw new InsufficientFundsException("Insufficient balance, minimum balance not maintained.");
	        }
	    }
}
