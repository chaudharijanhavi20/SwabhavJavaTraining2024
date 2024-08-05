package Package;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AreaCalculatorTest {
	AreaClaculator calculator;

	public void init() {
		calculator = new AreaClaculator();
	}

	@Test
	public void testCalculateAreaOfCircle() {
		assertEquals(78.5, calculator.calculateAreaOfCircle(5));
	}
	@Test
	public void testCalculateAreaOfTriangle() {
		assertEquals(25,calculator.calculateAreaOfTriangle(5, 10));
	}
}
