package com.cognixia.jump.corejava.arraysAndCollections;

import java.lang.reflect.Array;
import java.util.Arrays;
import com.cognixia.jump.corejava.classes.*;


public class ArraysDriver {

	public static void main(String[] args) {

		// create some arrays
		
					// declare - primitives and object arrays
					int[] integers;
					boolean[] booleans;
					short[] shorts;
					// array of objects
					Animal[] animals;
					// these are the same, but line 10 is better syntax
					int ints[];
				
					// initializing
						// no values
						integers = new int[5];   // starts with 0s in all elements
						animals = new Animal[5]; // starts with null in all elements
					
						// with values - must declare and init at same time
						// primitives
						short[] altShorts = {12, 25, 31, 44, 5};
						//objects
						Animal[] altAnimals = {new Animal("Dog"), new Animal("Fish"), new Animal("Elephant")};
				// accessing - reading and writing to array
						// Read from array - 1 elem
						System.out.println(animals[0]);
						System.out.println(altAnimals[0]);
						System.out.println(integers[0]);
						System.out.println(altShorts[4]);
						
						// write to array - 1 elem
						integers[0] = 25;
						animals[0] = new Animal("Alligator", 1000, 2, false, true);
						altAnimals[0] = null;
						altShorts[4] = 0;
						
						// printing again so see the write changes
						System.out.println("\nAfter write changes");
						System.out.println(animals[0]);
						System.out.println(altAnimals[0]);
						System.out.println(integers[0]);
						System.out.println(altShorts[4]);
				
				// looping / iterating through arrays
						// traditional for loop
						// we'll use altAnimals and altShorts
						
						// going forwards, 1 at a time to the end
						for(int i = 0;i < altAnimals.length; i++) {
							System.out.println(altAnimals[i]);
						}
						
						// regular for loop, but print from end to beginning
						// short[] altShorts = {12, 25, 31, 44, 0};
						for(int i = altShorts.length-1; i >= 0; i--) {
							System.out.println(altShorts[i]);
						}
						
						System.out.println("\nFor Each Loop:");
						// for each loop - not handling indexs -> no [i]
						// primitives - show read and write with foreach
						for(short s : altShorts) {
							s = 0;
						}
						
						for(short s : altShorts) {
							System.out.println(s);
						}
						
						//objects, same as above
						// **write into an existing object
						for(Animal a : altAnimals) {
							if(a != null) {
								a.setType("Crocodile");
							}
						}
						
						for(Animal a : altAnimals) {
							if(a != null) {
								System.out.println(a);
							}
						}
						
						// homogenous array - objects only
						// see altAnimals array above
						
						// hetorgenous array
						Animal[] mixArray = {new Dog(), new Animal("Cat"), new Dog("Maltese")};
						
						Animal dog = new Dog();
					
						for (Animal animal : mixArray) {
							System.out.println(animal);
						}
						
						// 2D Array - simple, iterating
						int[][] array2D = new int[4][4]; 
						
						int[][] array2D2 = {
								{1,2,3,4},
								{1,2,3,4},
								{1,2,3,4}
						};
						
						// the .length of a 2d array gets the number of rows
						System.out.println("\n2d Array Eg.");
						for(int row = 0; row < array2D2.length; row++) {
							int r = row;
							for(int col = 0; col < array2D2[row].length; col++) {
								int c = col;
								System.out.println("row=" + r + " " + 
										" col=" + c + " " + array2D2[row][col]);
							}
						}
						
						// An array itself is an object. Meaning there must be a class
						// called Array.  Therefore we have some instance and class(static) 
						// methods we can use as well when working with arrays.
						int[] demoInts = {10, 30, 20, 50, 40};
						// Instance methods
						demoInts.toString();
						System.out.println(demoInts);
						// Class (static) methods
						int x = Array.getInt(demoInts, 4);
						int y = demoInts[4];
						
						// A utility class for arrays
						String print = Arrays.toString(demoInts);
						System.out.println(print);
						System.out.println(Arrays.toString(demoInts));
						
						System.out.println(reverseString("Sentence"));
				
			}
			
			// Test word - "Hello"
			public static String reverseString(String input) {
				// we need to convert the String to char[]
				char[] charArray = input.toCharArray();
				// StringBuilder builder = new StringBuilder(input);
				// create an array to store our solution
				char[] reversed = new char[input.length()];
				// use one loop for 2 arrays, working backwards on our input string
				// another index for my empty array starting at beginning
				int revIndex = 0;
				for(int i = charArray.length-1; i >= 0; i-- ) {
					reversed[revIndex] = charArray[i];
					revIndex++;
				}
				String output = "";
				
				// return new String(reversed);
				return output.valueOf(reversed);
			}
			
			public static String reverseStringAlt(String input) {
				StringBuilder builder = new StringBuilder(input);
				builder.reverse();
				return builder.toString();
		
	}
	
	
}
