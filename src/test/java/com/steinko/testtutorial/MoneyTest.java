package com.steinko.testtutorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MoneyTest {
		
	@Test
	void shoulNotBeEqual() {  
		assertNotEquals(Money.dollar(5),Money.franc(5));
	}
	
	@Test
	void shouldReurnSum() {   
		Money fivedollar = Money.dollar(5);
		Expression sum = fivedollar.sum(fivedollar);
		Bank bank = new Bank();
		assertEquals(Money.dollar(10),bank.reduce(sum,"USD"));
	}
	
	@Test
	void shouldReturnSum2() { 
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum)result;
		
		assertEquals(five,five);
		assertNotNull(sum.augmend);
		assertEquals(five,sum.augmend);
		assertEquals(five,sum.addmend);
		
	}

}
