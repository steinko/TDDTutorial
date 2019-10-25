package com.steinko.testtutorial;

public  class Money implements Expression {
	 protected int multi;
	 protected String currency;
	
	protected int amount;
	
	public Money(int multi, String currency) { 
		this.multi = multi;
		this.currency = currency;
	}
	

	public static Money dollar(int amount) { 
		return new Money(amount,"USD");
	}
	
	public static Money franc(int amount) { 
		return new Money(amount,"CHF");
	}
	
	public Money times(int multiplier) {
		this.amount = this.multi * multiplier;
		return new Money(amount(),this.currency());
	}
		

	@Override
	public boolean equals(Object object) { 
		Money arg = (Money)object;
		return arg.amount == this.amount
		       && this.currency().equals(arg.currency());
	}

	public int amount() {return amount; }

	public  String currency() {return this.currency; }
	
	@Override
	public String toString() { 
		             return "amount =" + amount + ", currency =" + currency;
		          }

	public Expression sum(Money addedent) {
		
		return new Money(this.amount()+ addedent.amount(),this.currency);
	}


	public Expression plus(Money five) {
		// TODO Auto-generated method stub
		return new Sum();
	}

	
	public Money reduce(Expression expression, String currency) 
	{ return this; }
	

}
