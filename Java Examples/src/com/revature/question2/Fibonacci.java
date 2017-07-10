//This Package is used to perform the fibonacci sequence up to 24 times.
package com.revature.question2;

public class Fibonacci {
	
	public static void fib(){
	//variable created to be used as a max size	
	 int count = 25;
	 
     int[] arr = new int[count];
     
     //setting the fisrt and second integer. if not set will
     //print all zeros
     arr[0] = 0;
     arr[1] = 1;
     //fibonacci sequence 
     for(int i = 2; i < count; i++) {
        arr[i] = arr[i-1] + arr[i-2];
     } 
     // Displays the sequence to user
     for(int i = 0; i< count; i++) {
        System.out.print(arr[i] + " ");
}
	}
	
	public static void main(String[] args){
		//calling method to perform Fibonacci sequence
		fib();
	}
}
