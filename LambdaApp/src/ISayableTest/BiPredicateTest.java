package ISayableTest;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> numberchecker = (Integer number1, Integer number2) -> number1 > number2;
		System.out.println(numberchecker.test(4, 9));

	}
}
