package com.revature.question15;

import java.util.Scanner;

public class MathInterface {
	private Scanner scan;
	public static void main(String[] args){

	    new MathInterface().compute();

	}
	private void compute(){
        scan = new Scanner(System.in);

        double num1,num2;
        System.out.print("Please enter your first number: ");
        num1 = scan.nextDouble();
        System.out.print("Please enter your second number: ");
        num2 = scan.nextDouble();
        System.out.print("Select (1) for addition, (2) to subtract, (3) for multiplication or (4) to divide: ");
        int choice;
        choice = scan.nextInt();
        switch (choice) {
            case 1: {
                System.out.print(add(num1, num2));
                break;
            }
            case 2: {
                System.out.print(subtract(num1, num2));
                break;
            }
            case 3: {
                System.out.print(multipliy(num1, num2));
                break;
            }
            case 4: {
                System.out.print(divide(num1, num2));
                break;
            }
            default:{
                System.out.println("Error");
                break;
            }
        }
	}
 

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

	public double multiply(double a, double b) {
		return 0;
	}

	public double multipliy(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
       return b==0 ? 0: a/b;

    }
	interface Math{
		double add(double x, double y);
		double subtract(double x, double y);
		double multiply(double x, double y);
		double divide(double x, double y);


	}
}
