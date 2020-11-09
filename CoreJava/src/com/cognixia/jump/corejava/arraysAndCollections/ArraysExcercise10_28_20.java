package com.cognixia.jump.corejava.arraysAndCollections;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExcercise10_28_20 {

	public static void main(String[] args) {

		// declare and initialize type int arrays
		// same size, same values, different order
		int[] array1 = { 5, 6, 7, 8 };
		int[] array2 = { 6, 7, 8, 5 };

		// same size, different values
		int[] array3 = { 1, 2, 3, 4 };

		// different size, different values
		int[] array4 = { 5, 6, 8, 4, 5 };

		boolean check = compareArrays(array1, array2);
		System.out.println(check);
		// used to compare 1st array (chosen from array options above)
//		int[] compare1 = null;
//		// used to compare 2nd array (chosen from array options above)
//		int[] compare2 = null;
//		
//		System.out.println("Enter an array: ");
//		
//		// start with most restrictive; same size, same values, same order
//		if ((compare1.length == compare2.length) + ) {
//			System.out.println("This is a complete match!");
//		}
//		
//		// same size, same values, different order
//		else if () {
//			System.out.println("This is a partial match (different order).");
//		}
//		
//		else () {
//			System.out.println("No match.");
//		}

	}

	// 2 arrays in; boolean out
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		// easiest way to stop process
		if (arr1.length != arr2.length) {

			System.out.println("No match.");
			return false;
		}

		else if () {
			// for loop
			// sort (most efficient)
			// sorts arrays by ascending order
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			int arr2Index = 0;
			// one loop; two arrays
			// handles indexes of 1st array; starts at [0] and goes to end of array
			for (int index : arr1) {
				// if value of arr1[0] != arr2[0], return false; will check all indexes in the
				// same way
				if (index != arr2[arr2Index]) {
					// exit method with boolean false
					return false;
				}
				// iterate through indexes of 2nd array
				arr2Index++;
			}
		}
		
		else {
			// for loop
			// sort (most efficient)
			// sorts arrays by ascending order
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			int arr2Index = 0;
			// one loop; two arrays
			// handles indexes of 1st array; starts at [0] and goes to end of array
			for (int index : arr1) {
				// if value of arr1[0] != arr2[0], return false; will check all indexes in the
				// same way
				if (index != arr2[arr2Index]) {
					// exit method with boolean false
					return false;
				}
				// iterate through indexes of 2nd array
				arr2Index++;
			}
				System.out.println("This is a partial match.");
		}

		// unless proven false, return true
		return true;
	}

}
