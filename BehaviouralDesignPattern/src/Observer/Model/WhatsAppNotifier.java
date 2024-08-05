package Observer.Model;

public class WhatsAppNotifier implements INotifier {
	public void notify(Account account) {
		System.out.println("Sending WhatsApp notification to " + account.getName()+" And after withdrawing,your remaining money :"+account.getBalance());
	}
}
