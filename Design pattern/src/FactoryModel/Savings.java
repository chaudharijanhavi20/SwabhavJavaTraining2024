package FactoryModel;

public class Savings implements IAccount{

	@Override
	public void credit() {
		System.out.println("credited from saving account");
	}

	@Override
	public void debit() {
		System.out.println("Debited from saving account");
	}

}
