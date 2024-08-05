package Observer.Model;

public class EmailNotifier implements INotifier {

	public void notify(Account account) {
		
		System.out.println("Sending email notification to " + account.getName()+" And after withdrawing,your remaining money "+account.getBalance());
	}

}
