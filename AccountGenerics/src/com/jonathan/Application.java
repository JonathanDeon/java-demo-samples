package com.jonathan;

public class Application {

	public static void main(String[] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount();
		
		Account<SavingsAccount> account = new Account<SavingsAccount>(savingsAccount);
		account.showRate();

	}

}
