package com.revature.question19;
//⎫This Package creates an ArrayList and insert integers 1 through 10. Display the ArrayList. 
//Adds all the even numbers up and display the result. Add all the even numbers up and display 
//the result. Add all the odd numbers up and display the result. Remove the prime numbers
//from the ArrayList and prints out the remaining ArrayList.

import java.util.ArrayList;
import java.util.HashSet;

public class Array {

	private static boolean isPrime(int n){
		int square = (int)Math.ceil((Math.sqrt(n)));//find the square root
		HashSet<Integer> nos = new HashSet<>(); 
		for(int i=1;i<=square;i++){
			if(n%i==0){
				if(n/i==i){
					nos.add(i);
				}else{
					nos.add(i);
					int rem = n/i;
					nos.add(rem);
				}
			}
		}
		return nos.size()==2;//if contains 1 and n then prime
	}// end of isPrime(used to check prime numbers

	public static void main(String args[]) {


		/*Creation of ArrayList: I'm going to add String
		 *elements so I made it of string type */
		ArrayList<Integer> obj = new ArrayList<Integer>();
		ArrayList<Integer>  prime = new ArrayList<Integer>();

		//adding elements to the array
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);
		obj.add(9);
		obj.add(10);

		//displaying array list
		System.out.print("List: ");
		System.out.println(obj);

		//variables used to place total
		int evenTotal = 0;
		int oddTotal = 0;

		//Determining odds and evens and adding sums
		for (int i=0;i<obj.size();i++){      
			int even=obj.get(i)%2;       
			if (even==0)    
				evenTotal+= obj.get(i);
			else
				oddTotal+= obj.get(i);  
		}//end of loop

		//print out totals of odds and evens
		System.out.println("Even total is: " + evenTotal);
		System.out.println("Odd total is: " + oddTotal);
		//loop for placing prime numbers into a new array
		for (int i=0; i<obj.size(); i++){
			if(!isPrime(obj.get(i))){
				prime.add(obj.get(i));
			}
		}
		System.out.println("This is the list excluding primes: " + prime);

	}//end of main
}//end of class
