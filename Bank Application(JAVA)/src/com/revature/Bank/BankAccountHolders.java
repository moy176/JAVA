package com.revature.Bank;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BankAccountHolders {
	
	private List<BankUser> bankUsers;
	
	public BankAccountHolders(){
		bankUsers = new ArrayList<>();
		
		// make few bankusers instances and add them
		
		bankUsers.add(new BankUser("Raymond","Charles","RCgo","zebra"));
		BankUser user=new BankUser("Jonn","Doe","slayer", "tank");
		user.addAccount(new BankAccount("Saving", 23123123, 10000));
		user.addAccount(new BankAccount("Checking", 23123123, 10000));
		
		bankUsers.add(user);
		//writing from to file (data.txt)///////////////
		write(bankUsers);
		bankUsers = null;
		//reading from to file (data.txt)///////////////
		bankUsers = (List<BankUser>)read();
	}


	public Serializable read(){
		Serializable inputdata = null;
		try(FileInputStream input = new FileInputStream("src/com/revature/Bank/data.txt");
				ObjectInputStream inputStream = new ObjectInputStream(input)){
			inputdata = (Serializable) inputStream.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputdata;
	}
	public void write(List<BankUser> bankUsers2){
		try(FileOutputStream fileReader= new FileOutputStream("/Users/admin/GitHub/1706-jun26-cuny/"
				+ "week1/Assignment2/src/com/revature/Bank/data.txt");
				ObjectOutputStream output = new ObjectOutputStream(fileReader)){
		output.writeObject(bankUsers2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
