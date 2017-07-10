package com.revature.question17;

//This program calculates interest for a loan, taking from using inputs with the use of Scanner
import java.util.Scanner;

import static java.lang.System.*;

public class simplePrinciple {

    private static Scanner scan = new Scanner(in);
	public static void main(String[] args){CalculateInterest();}/////End of main
	
	public static double CalculateInterest(){
	
	    out.println("Welcome to Simple Interest Calculator.");
		out.print("Please enter the Interest rate attached to the loan:");
	    double rate = scan.nextDouble();
        out.print("Enter the Capital Amount(Loan Amount): ");
        double capital = scan.nextDouble();
        out.print("Enter the amount of years for the loan:");
        int years = scan.nextInt();
        //creating variable to calculates interest
        double simpleinterest = (capital * rate * years)/100;

        out.println("Your interest will be: "+ simpleinterest);

 return simpleinterest;

    }
////End of Calculate Interest class
}
////LAST BRACKET