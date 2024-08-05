package FactoryModel;

public class Current implements IAccount {

	@Override
	public void credit() {
		System.out.println("credited from current account");

	}

	@Override
	public void debit() {
		System.out.println("Debited from current account");

	}

}
