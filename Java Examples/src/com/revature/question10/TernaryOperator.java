//This package finds the minimum of two numbers using Ternary operator
package com.revature.question10;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args){
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println(FindMin(5328,4369));
	
		
	}
	
	private static int FindMin(int a, int b){
		
		int min=0;
		min= (a<b)?a:b;
		return min;
	}
}
