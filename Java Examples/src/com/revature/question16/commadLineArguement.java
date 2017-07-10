package com.revature.question16;

public class commadLineArguement {

public static void main(String[] args){

	int sum = 20;
	for (int i = 0; i < args.length; i++) {
		sum = sum + Integer.parseInt(args[i]);
	}
	System.out.println("The sum of the arguments passed is " + sum);
}//end of main
}

