package com.cognixia.jump.corejava.arraysAndCollections;

import java.util.Arrays;

public class ArraysCodingChallenge10_30_20 {

	public static void main(String[] args) {

	// There is an integer array with values from 1 to 100, but one number is
	// missing. Locate the missing value.

	// Steps:
	// - build method
	// - sort array
	// - loop array
	// - compare array to 1 to 100 array template
	// - locate integer that does not match the array template
	// - print integer that does not match
	
		int[] array100 = new int[100];

		for (int i = 0; i < array100.length; i++) {
		  array100[i] = i + 1;
		}
		
		array100[7] = 0;
		System.out.println(Arrays.toString(array100));
		
		System.out.println(findMissingInt(array100));
	
	}
		
		public static int findMissingInt(int[] input) {
	
		
			// maybe there is an easier way to assign this rather than typing 1 to 100
			// manually? (for loop set to iterate
			// up from 1 and end at 100?)
				// yes!
//				int[] array100 = new int[100];
//	
//				for (int i = 0; i < array100.length; i++) {
//				  array100[i] = i + 1;
//				}
			
			int[] template = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
					26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
					52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
					78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
	
			int templateIndex = 0;
			// one loop; two arrays
			// handles indexes of 1st array; starts at [0] and goes to end of array
			for (int index : input) {
				// if value of arr1[0] != arr2[0], return false; will check all indexes in the
				// same way
				if (index != template[templateIndex]) {
					
					// print integer at index that didn't match
					return template[templateIndex];
				}
				// iterate through indexes of 2nd array
				templateIndex++;
	
			}
	
			return 0;
			
		}
	
	
}
