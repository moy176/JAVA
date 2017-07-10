//This package creates an array list from 1 to 100, then removes all prime numbers
//and displays them in another array list

package com.revature.question9;

import java.util.ArrayList;
import java.util.HashSet;

public class arrrayPrime {
	//creates an array list
    private static ArrayList<Integer> primeList = new ArrayList();
    
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
    

    public static void main(String[] args) {
    	//Loop for adding prime numbers into a separate array list
       for(int i = 0; i <=100; i++)
    	   if(isPrime(i))
    	   primeList.add(i);
       //loop printing out each prime number
       for(int i = 0; i < primeList.size();i++)
    	   System.out.printf("%d\t",primeList.get(i));
    }

}
