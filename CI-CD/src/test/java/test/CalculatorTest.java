package test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

import calc.Calculator;

class CalculatorTest {

	@Test
	void test_sum() {
		//test		
		Calculator cal = new Calculator();
		assertEquals(6, cal.sum(2, 4));
	}
	
	@Test
	void test_sum2() {
		Calculator cal = new Calculator();
		assertEquals(6, cal.sum(2, 2));
	}
}
