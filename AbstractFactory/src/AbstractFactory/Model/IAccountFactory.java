package AbstractFactory.Model;

public interface IAccountFactory {

	 IAccount createSavingsAccount(int accNo, String name, double balance);
	    IAccount createCurrentAccount(int accNo, String name, double balance, double overdraft);
	}
