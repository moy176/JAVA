package com.revature.question5;

import java.util.Scanner;

public class subString {
	static String subString(String str, int idx) {
		  if(idx > str.length())
	            return str;
		  //creating new string to return new substring
	        char[] substring = new char[idx];
	        
	        for(int i = 0; i < idx; i++)
	            substring[i] = str.charAt(i);

	        return String.valueOf(substring);
		}
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter desired text: ");
		String str = scan.nextLine();
		System.out.print("Enter an interger: ");
		int i = scan.nextInt();
		System.out.println(subString(str,i));
		
		
	}

}
