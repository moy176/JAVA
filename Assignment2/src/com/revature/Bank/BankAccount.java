package com.revature.Bank;
import java.io.Serializable;
import java.util.Scanner;

import exceptions.NotEnoughMoneyException;


@SuppressWarnings("serial")
public class BankAccount implements Serializable{
	
	private String accountName;
	private double accountNumber, balance;

	public BankAccount() {

	}

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(String accountName, double accountNumber, double balance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	//methods to deposit of withdraw from bank acct
	public void deposit(double amount){
		this.balance+=amount;
	}

	public void withdraw(double amount){
		if(this.balance < amount)
			throw new NotEnoughMoneyException();
		else
			this.balance-= amount;
		
	}

	public void acctOptions(){

		System.out.println("Account Options...");
		System.out.println("Please select 1-4");
		System.out.println("1.Deposit funds.");
		System.out.println("2.Withdraw Funds.");
		System.out.println("3.Show balence.");
		System.out.println("4.Exit application");

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		switch (x){
			case 1:{
				System.out.println("Enter the amount you would like to deposit");
				int amt = (int) scan.nextLong();
				this.deposit(amt);
				System.out.println("Acct Balence: "+ this.getBalance());
				acctOptions();
			}
			case 2:{
				//withdraw funds
				System.out.println("Enter the amount you would like to witdraw");
				int amt = (int) scan.nextLong();
				this.withdraw(amt);
				System.out.println("Acct Balence: "+ this.getBalance());
				acctOptions();
			}
			case  3:{
				System.out.println("Acct Balence: "+ this.getBalance());
				acctOptions();
			}
			case 4:{
				Logging logging = new Logging();
				logging.validate();
			}

		}


	}
	
}

