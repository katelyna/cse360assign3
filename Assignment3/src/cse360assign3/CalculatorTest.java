package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator calc = new Calculator();
	
	@Test
	public void testCalculator() {
		assertNotNull(calc);
	}
	
	@Test
	public void testGetFirstTotal() {
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testAdd() {
		calc.add(4);
		assertEquals(4, calc.getTotal());
	}
	
	@Test
	public void testSubtract() {
		calc.subtract(2);
		assertEquals(-2, calc.getTotal());
	}
	
	@Test
	public void testMultiply() {
		calc.add(2);
		calc.multiply(2);
		assertEquals(4, calc.getTotal());
	}

	public void testDivide() {
		calc.add(4);
		calc.divide(1);
		assertEquals(4, calc.getTotal());
	}
	
	@Test
	public void testDivideZero() {
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		calc.add(4);
		calc.subtract(2);
		calc.multiply(2);
		calc.divide(5);
		assertEquals("0 + 4 - 2 * 2 / 5", calc.getHistory());
	}
}
