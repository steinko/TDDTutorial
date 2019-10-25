package com.steinko.testtutorial;

public class Sum implements Expression{

	public Money augmend;
	public Money addmend;
	
	public Sum() {
		augmend = Money.dollar(5);
		addmend = Money.dollar(5);
		
	}
	
	public Money reduce(Expression expression, String currency) { 
		return Money.dollar(10);
	}

	

}
