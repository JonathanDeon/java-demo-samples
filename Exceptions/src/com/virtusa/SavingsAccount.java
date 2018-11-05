package com.virtusa;



public class SavingsAccount {

	public void deposit(Double amount) throws AccountException {
		if(amount<=0) {
			throw new AccountException("Value cannot be less than Zero");
		} else {
			System.out.println("Deposit Complted");
		}
	}
	
	public void withdraw(Double balance, Double amount) throws AccountValidationException {
		
		Validator validator = new Validator();
		try {
			if(validator.validate(balance, amount)) {
				System.out.println("Successful");
			}
		} catch (AccountOverDueException e) {
			throw new AccountValidationException("Blance insuffient",e);
		}

	}
}
