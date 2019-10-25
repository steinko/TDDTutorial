package com.steinko.testtutorial;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrancTest {
Money five;
	
	@BeforeEach
	void setUp() { 
		five = Money.franc(5);
	}
	
	@Test
	void shouldMultiply10()  {
		
		Money product = five.times(2);
		assertEquals(Money.franc(10), product);
	}
	@Test
	void shouldMultiply25()  {
		Money product = five.times(5);
		assertEquals(Money.franc(25), product);
	}
	
	@Test
	void shouldMultiplyTwice()  {
		
		Money product = five.times(2);
		assertEquals(Money.franc(10), product);
		product = five.times(3);
		assertEquals(Money.franc(15), product);
	}
	
	@Test
	void shoulBeEqual() {  
		assertEquals(Money.franc(5),Money.franc(5));
	}
	
	@Test
	void shoulNotBeEqual() {  
		assertEquals(Money.franc(5),Money.franc(8));
	}
	
	@Test void shouldHaveCurrecncyCHF() {  
		      assertEquals("CHF",five.currency());
	}
		

}
