package com.revature.question8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class palindrome {
	//loading string into an array
    private static List<String> stringList = Arrays.asList( "karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john","refer",
            "billy", "did");
    //creating a second array for the palindromes
    private static List<String > palindromeArray = null;
    //seperating the palindromes from the string
    private static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    private static void printArray(Predicate<String> test, List<String> list){
        list.stream().filter(test).forEach((a)-> System.out.printf("%s\t",a));
    }
    private static List<String> groupPalindrome(List<String> list, Predicate<String> test){
        return list.stream().filter(test).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Entire list");
        printArray((a)->true,stringList);
        palindromeArray = groupPalindrome(stringList,(a)->isPalindrome(a));
        System.out.println("\nOnly Palindrome");
        printArray((a)->true,palindromeArray);
    }

}
