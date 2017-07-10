//This packages is used to perform a bubble sort on an array of integers
package com.revature.question1;

import java.util.Arrays;

public class BubbleSort {

	static int temp = 0;
	static int arr[] = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };

	public static void main(String[] args) {
		// Prints out initial Array
		System.out.println("Array: " + Arrays.toString(arr));
		// Prints empty line
		System.out.println();
		// function call to start sorting
		Sort();
		// Prints out new Array
		System.out.println("Array: " + Arrays.toString(arr));
	}

	///// *******************************************************//////
	public static void Sort() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swapping elements around
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}