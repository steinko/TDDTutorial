package com.steinko.testtutorial;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DollarTest {
	Money five;
	
	@BeforeEach
	void setUp() { 
		five = Money.dollar(5);
	}
	
	@Test
	void shouldMultiply10()  {
		
		Money product = five.times(2);
		assertEquals(Money.dollar(10), product);
	}
	@Test
	void shouldMultiply25()  {
		Money product = five.times(5);
		assertEquals(Money.dollar(25), product);
	}
	
	@Test
	void shouldMultiplyTwice()  {
		
		Money product = five.times(2);
		assertEquals(Money.dollar(10), product);
		product = five.times(3);
		assertEquals(Money.dollar(15), product);
	}
	
	@Test
	void shoulBeEqual() {  
		assertEquals(Money.dollar(5),Money.dollar(5));
	}
	
	@Test
	void shoulNotBeEqual() {  
		assertEquals(Money.dollar(5),Money.dollar(8));
	}
	
	@Test void shouldHaveCurrecncyUSD() {  
		assertEquals("USD",five.currency());
	}
		
}
