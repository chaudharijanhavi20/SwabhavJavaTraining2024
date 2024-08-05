package Observer.Model;

public class SMSNotifier implements INotifier{

	public void notify(Account account) {
        System.out.println("Sending SMS notification to " + account.getName()+" And after withdrawing, your remaining balance is :"+account.getBalance()+". ");
    }
}
