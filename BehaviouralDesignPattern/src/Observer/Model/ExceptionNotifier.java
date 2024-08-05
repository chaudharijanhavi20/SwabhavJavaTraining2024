package Observer.Model;

public class ExceptionNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println(new InsufficientFundsException().getMessage());

	}

}
