package test;

import calc.Calculator;

class CalculatorTest {

	@Test
	void test_Sum() {
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
