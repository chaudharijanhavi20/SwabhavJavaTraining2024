package Package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operation;

	@BeforeEach
	void init() {
		operation = new Operations();

	}

	@AfterEach
	void status() {
		System.out.println("Test Finished !!");
	}

	@Test
	public void testAddition() {
		assertEquals(30, operation.addition(10, 20), "This method must perform addition.");
	}

	@Test
	public void testSubstraction() {
		assertEquals(-10, operation.substraction(10, 20), "This method must perform substraction.");
	}

	@Test
	public void testMultiplication() {
		assertEquals(200, operation.multiplication(10, 20), "This method must perform Multiplication.");
	}
	public void division() {
		assertEquals(2.0,operation.division(20,10));
		assertThrows(ArithmeticException.class,()->operation.division(10, 0));
		
	}

	@Test
	public void testSquareOfArrayElements() {
		int squares[] = { 25, 36, 49 };
		int numbers[] = { 5, 6, 7 };
		assertArrayEquals(squares, operation.squareOfNumbers(numbers));
	}

	@Test
	public void testIsEven() {
		assertTrue(operation.isEven(6));
		assertFalse(operation.isEven(7));
	}
}
