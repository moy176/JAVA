package com.revature.question3;

public class ReverseString {
	
	int c=0;
	int res;
	
	public static void Reverse(String s){
		
		char[] c= new char[s.length()];
		
		for(int i=0; i< s.length(); i++){
			c[i]=s.charAt(i);
		}
		for(int i=s.length()-1; i>=0; i--){
			System.out.print(c[i]);
		}
	}
	
	public static void main(String[] args){
		
		System.out.println("Revature");
		System.out.println("••••••••");
		Reverse("Revature");
	}

}
