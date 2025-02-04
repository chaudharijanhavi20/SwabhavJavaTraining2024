package AbstractFactory.Model;

public class BankAccountFactory implements IAccountFactory {
    @Override
    public IAccount createSavingsAccount(int accNo, String name, double balance) {
        return new SavingsAccount(accNo, name, balance);
    }

    @Override
    public IAccount createCurrentAccount(int accNo, String name, double balance, double overdraft) {
        return new CurrentAccount(accNo, name, balance, overdraft);
    }
}