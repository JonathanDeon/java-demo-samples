package com.virtusa;

public class Validator {
	
	public boolean validate(double balance, double amount) throws AccountOverDueException {
		if(balance<0) {
			throw new AccountOverDueException("This Account is overdue");
		} else {
			return true;
		}
	}
}
