package com.revature.Bank;

import java.util.ArrayList;
import java.util.List;
import com.revature.Bank.*;

import exceptions.UserNotFoundException;

import java.io.Serializable;

public class BankUser implements Serializable{
	private static final String ADMIN_USERNAME = "admin";
	private static final String PASS_WORD = "admin1";
	
	private String fristName,lastName,userName,password;
	private List<BankAccount> accounts = new ArrayList<>();
	//Constructor/////////////////////////////////////////
	public BankUser(String fristName, String lastName, String userName, String password) {
		this.fristName = fristName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}
	//Getters and Setters/////////////////////////////////
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	//methods to add and delete accounts
	public void addAccount(BankAccount bankAccount){
		this.accounts.add(bankAccount);	
	}
	public void deleteAccount(double accountNumber){
		BankAccount temp = null;
		
	for(BankAccount account : this.accounts){
		if(accountNumber == account.getAccountNumber())
			temp = account;
		if(temp == null)
			throw new UserNotFoundException();
		else
			this.accounts.remove(temp);
	}
	
}
//toString to print from Array
	@Override
	public String toString() {
		return "BankUser [fristName=" + fristName + ", lastName=" + lastName + ", userName=" + userName + ", password="
				+ password + ", accounts=" + accounts + "]";
	}


}
