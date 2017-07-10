package com.revature.question14;

import java.util.Scanner;
import java.util.Date;

//Write a program that demonstrates the switch case. Implement the following functionalities in the cases:
////Case 1: Find the square root of a number using the Math class method. 
////Case 2: Display today’s date.
////Case 3: Split the following string and store it in a sting array. 
////		“I am learning Core Java”


public class Switch {
	private static Scanner scan = new Scanner(System.in);
	
		public static void main(String args[]){
		switchStatement();	
	}//end of main
private static void switchStatement(){
	
    System.out.println("Enter #1 Find the square root of a number.");
    System.out.println("Enter #2 Display today's date.");
    System.out.println("Enter#3 split the following string and store "
    		+ "it in a sting array 'I am learning Core Java'");
    
    int n = scan.nextInt();
    
    switch(n){
    case 1:{
	    	System.out.print("Please enter the number you would "
	    			+ "like to find out the Square Root of: ");
	    	int i = scan.nextInt();//taking in user inputs
	    	System.out.println(Math.sqrt(i));//print out square root  	
    break;
    }
    case 2:{
	    	Date d = new Date();
			System.out.println("Todays Date is: "+d);
    break;
    }
    case 3:{
    	String s1="it in a sting array 'I am learning Core Java";  
    	String[] words=s1.split("\\s");//splits the string based on whitespace  
    	//placing elements into a third array 
    	for(String s3:words){  
    	System.out.println(s3);  
    	}  
    	break;
    }
    
    }//end of switch statement
	
}
}
