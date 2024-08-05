package ThreadModel;

import java.util.concurrent.Callable;

public class NewTask implements Callable {

	@Override
	public Object call() throws Exception {

		return (Math.random() * 100);
	}

}
