package ISayableTest;

import java.util.function.BiConsumer;

public class ByConsumer {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> consumers = (Integer number1, Integer number2) -> System.out
				.print(number1 + number2);
		consumers.accept(3, 4);
	}
}
