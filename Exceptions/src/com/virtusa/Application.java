package com.virtusa;


public class Application {

	public static void main(String[] args) {
//		SavingsAccount savingsAccount = new SavingsAccount();
//		savingsAccount.deposit(-10.0);
		
		Operation operation = new Operation();
		try {
			operation.get(10.0);
		} catch (AccountException e) {
			e.printStackTrace();
		}


	}

}
