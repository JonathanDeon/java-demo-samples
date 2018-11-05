package com.virtusa;

public class Operation {

	public void save(double amount) throws RuntimeException {
		SavingsAccount savingsAccount = new SavingsAccount();
		try {
			savingsAccount.deposit(amount);
			return;
		} catch(AccountException e) {
			amount = amount*-1;
		}
		
		try {
			savingsAccount.deposit(amount);
		 return;
		} catch(AccountException e) {
			throw new RuntimeException();
		}
		
	}
	
	public void get(double amount) throws AccountException {
		SavingsAccount savingsAccount = new SavingsAccount();
		try {
			savingsAccount.withdraw(-100.0, -10.0);
		}catch(AccountValidationException e){
			throw new AccountException("Account Valid fail",e);
		}
		
	}
}
