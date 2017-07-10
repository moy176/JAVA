package com.revature.question4;

public class NFactorial {

	static class Factorial{ 
		
		 static int factorial(int n){    
		  if (n == 0)    
		    return 1;  //return 1 if number is zero  
		  else  
		    return(n * factorial(n-1)); //calculating N-factorial  
		 }    
		 public static void main(String[] args){  
		  int fact=1;  
		//It is the number to calculate factorial 		 
		  int number=10;   
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		}  
}
