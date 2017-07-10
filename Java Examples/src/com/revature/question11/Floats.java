package com.revature.question11;

//This packages grabs two floats from an external package

import com.revature.question11b.ExternalFloats;

public class Floats {

	public static void main(String[] args){
		System.out.println("The first float is: "+ ExternalFloats.num1);
		System.out.println("The first float is: "+ ExternalFloats.num2);
	}//end of main
}
