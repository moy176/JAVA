package com.revature.question20;

public class Person {
	
	private String FirstName;
	private String LastName;
	private String State;
	private int Age;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	@Override
	public String toString() {
		String str="Name: " +" "+ FirstName +" "+ LastName+ "\n"
				+ "Age: "+ Age + " years"+"\n" + "State: "+ State + " State";
		return str;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	

}
