package com.calculator.presentation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void setUpTest() {
		Calculator c = new Calculator(); 
	}
	
	@Test
	void isPositiveTest() {
		Calculator c = new Calculator();
		assertTrue(c.isPositive(4.0));
		assertFalse(c.isPositive(-4.0));
		assertFalse(c.isPositive(0.0));
	}
	
	@Test
	void powerTest() {
		Calculator c = new Calculator();
		assertEquals(4.0, c.power(2.0, 2));
		assertEquals(0.5, c.power(2.0, -1));
		assertEquals(1.0, c.power(2.0, 0));
	}

}
