package com.bankaccount;
import java.util.*;

public class BankAccount {
	private static String accountNumber;
	private static double checkingBalance = 0.0;
	private static double savingsBalance = 0.0;
	
	private static int numberOfAccounts = 0;
	public double money;
	public static double totalMoney;
	
	private String accountNumber() {
		Random r = new Random();
		int number;
		for(int i = 0; i < 10; i++) {
			number = r.nextInt(); 
			accountNumber += Integer.toString(number);
		}
		return accountNumber;
	}
	
	public BankAccount() {
		accountNumber = accountNumber();
		numberOfAccounts++;
	}
	
	public static double allAccountsTotal() {
		System.out.println("The total of all accounts is " + totalMoney);
		return totalMoney;
	}
	
	
	public double depositMoney(double money, String account) {
		double balance = 0;
		if(account == "Checking") {
			checkingBalance += money;
			System.out.println("Your checkings balance is now " + checkingBalance);
			totalMoney += checkingBalance;
			balance = checkingBalance;
		}
		if(account == "Savings") {
			savingsBalance += money;
			System.out.println("Your savings balance is now " + savingsBalance);
			totalMoney += savingsBalance;
			balance = checkingBalance;
		}
		return balance;
	}
	
	public double withdrawMoney(double money, String account) {
		double balance = 0;
		if(account == "Checking" && checkingBalance > money) {
			checkingBalance -= money;
			System.out.println("Your checkings balance is now " + checkingBalance);
			totalMoney += checkingBalance;
			balance = checkingBalance;
		}if(account == "Checking" && checkingBalance < money) {
			
			System.out.println("Insufficient funds. You can't withdraw " + money + " from " + savingsBalance);
		}
		if(account == "Savings" && savingsBalance > money) {
			savingsBalance -= money;
			System.out.println("Your savings balance is now " + savingsBalance);
			totalMoney += savingsBalance;
			balance = savingsBalance;
		}if(account == "Savings"&& savingsBalance < money) {
			System.out.println("Insufficient funds. You can't withdraw " + money + " from " + savingsBalance);
		}
		return balance;
	}
	

	public static double getCheckingBalance() {
		System.out.println("Your checkings balance is now " + checkingBalance);
		return checkingBalance;
	}

	public static void setCheckingBalance(double checkingBalance) {
		BankAccount.checkingBalance = checkingBalance;
	}

	public static double getSavingsBalance() {
		System.out.println("Your checkings balance is now " + savingsBalance);
		return savingsBalance;
	}

	public static void setSavingsBalance(double savingsBalance) {
		BankAccount.savingsBalance = savingsBalance;
	}
	
	
}
