package ISayableTest;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> squarNumber = (Integer number) -> number * number;
		method(squarNumber);
		//
		// BiFunction<Integer,Integer,Integer> AddNumbers=(Integer number1,Integer
		// number2)->number1+number2;
		// System.out.println(AddNumbers.apply(5,9));
	}

	private static void method(Function<Integer, Integer> squarNumber) {
		System.out.println(squarNumber.apply(5));
	}
}
