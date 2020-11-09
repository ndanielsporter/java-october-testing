package com.cognixia.jump.corejava;

public class FizzBuzz {

	public static void main(String[] args) {

		// FizzBuzz project
		// -method should print out a list of n with each index of i following these
		// rules
		// -if number n is divisible by 3 print "Fizz"
		// -if number n is divisible by 5 print "Buzz"
		// -if number n is divisible by both 3 and 5 print "FizzBuzz"
		// -do not print n if number is prime (bonus)

		// start point
		int n = 100;

		System.out.println("\nFizzBuzz Start:\n");

		for (int i = 1; i < n; i++) {

			// div. by 3 and 5; print FizzBuzz
			// most restrictive option at top
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			}

			// div. by 3; print Fizz
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}

			// div. by 5; print Buzz
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}

			else if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0)) {
				System.out.println(i);
			}
			// prime number; do not print i
			else {
				System.out.println(" ");
			}

		}

		System.out.println("\nFizzBuzz End.");
		// end point
	}

}
