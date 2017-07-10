//This package checks to see if a number is odd or even

package com.revature.question6;

import java.util.Scanner;

public class EvenNumber {

	public static void Even(long n){
		if((n & 1)==0){
			System.out.print("The number " + n +" is Even");
		}
		if((n & 1)!=0) {
			System.out.print("The number " + n + " is odd, not Even");
		} else
		{
			System.out.println("Error");
		}
	}//end of isEven

	public static void main(String[] args){

		long number;
		System.out.println("Please enter a number to determine if it even or not");
		Scanner s= new Scanner(System.in);
		number= s.nextInt();
		
		//passing user inputed variable to method
		Even(number);
		
	}//end of main

}
