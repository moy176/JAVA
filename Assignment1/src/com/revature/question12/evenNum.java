package com.revature.question12;

import java.util.ArrayList;

public class evenNum {
	
private static ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
private static ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

public static void main(String [] args){
	for(int i = 0 ; i <= 100; i++){
		if(isEven(i))
			evenNumbers.add(i);
		else
		 oddNumbers.add(i);
	}
	
	System.out.println("Even Numbers :");
	for(int i = 0; i < evenNumbers.size(); i++){
		
		System.out.printf("%d\t", evenNumbers.get(i));
		
		
	}
	
	System.out.println("\nOdd numbers :");
	for(int i = 0; i < oddNumbers.size(); i++){
		
		
		System.out.printf("%d\t", oddNumbers.get(i));
		
	}
	
	
}

private static boolean isEven(int n){
	
	return n % 2 == 0;
}

	
    
}//end of class