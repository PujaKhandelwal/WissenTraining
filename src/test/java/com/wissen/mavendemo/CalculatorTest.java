package com.wissen.mavendemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
	calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		int a = 10; int b = 25;
		int expectedResult = a+b;
		int result = calculator.add(a, b);
		assertEquals(expectedResult, result);
	
	}

	@Test
	public void testSub() {
		int a = 10; int b = 25;
		int expectedResult = a-b;
		int result = calculator.sub(a, b);
		assertEquals(expectedResult, result);
	}

	@Test
	public void testMult() {
		int a = 10; int b = 25;
		int expectedResult = a*b;
		int result = calculator.mult(a, b);
		assertEquals(expectedResult, result);
	}

	@Test
	public void testDiv() {
		int a = 10; int b = 100;
		int expectedResult = a/b;
		int result = calculator.div(a, b);
		assertEquals(expectedResult, result);
	}

}
