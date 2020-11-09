package com.cognixia.jump.corejava;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

public class CodingChallenge11052020 {

	public static void main(String[] args) {
		
		// steps:
		// -build Scanner for input
		// -build method
		// -identify number of words; ignore case (Strings excluding space)
		// -sort results alphabetically
		// -print by line
		
		String str1 = "hello Hello this Is a Test test Yes yes";
		
		// Write a method that counts how many unique words are in a string. Make sure that it prints in alphabetical order
		public static String identifyAndPrintWordsAlphabetical(String[] input) {
			
			// split String by space to identify unique words
			String[] uniqueWords = input.split(" ");
			
			// organize collection into set to avoid duplicates
			Set<String> returnWords = new Set<>(Arrays.asList(uniqueWords));
			
			// for each loop to print each word in the set
			for(String s : returnWords)
				System.out.println(s);
			
		}

	}

}
