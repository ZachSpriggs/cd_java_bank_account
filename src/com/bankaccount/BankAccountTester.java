package com.bankaccount;

public class BankAccountTester {
	public static void main(String[] args) {
		BankAccount myAcc = new BankAccount();
		myAcc.depositMoney(500.00, "Checking");
		myAcc.getCheckingBalance();
		myAcc.depositMoney(800.29, "Savings");
		BankAccount.allAccountsTotal();
		myAcc.withdrawMoney(23.10, "Checking");
		myAcc.withdrawMoney(900.00, "Savings");
		
	}
}
