package Sreaming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 56, 200, 90);

		// Stream<Integer> numberStream = number.stream();
		numbers.stream().forEach((number) -> System.out.println(number));
		//
		// number.stream()
		// .filter((numbers)->(numbers%2!=0))
		// .filter((numbers)->(numbers>35))
		// .forEach((numbers) -> System.out.println(numbers));

		// List<Integer> squareNumbers=numbers.stream()
		// .map((number)->number*number)
		// .collect(Collectors.toList());
		// .forEach((number) -> System.out.println(number));

		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("sum : " + sum);
         System.out.println("For Ascending order :");
		numbers.stream()
		       .sorted()
		       .limit(3)
		       .forEach((number)->System.out.println(number));
		
		System.out.println("In descending order :");
		numbers.stream()
		  .sorted(Comparator.reverseOrder())
		  .forEach((number) -> System.out.println(number));
		
		Optional<Integer> max=numbers.stream().max((number1,number2)->number1-number2);
		if(max.isPresent())
			System.out.println("Max value is :"+max.get());
		
		
		
	}
}
