package com.cognixia.jump.corejava;

public class Assignment10192020 {

	public static void main(String[] args) {
		
		// assignment:
//			In this assignment simply print some variables and calculations to the console.
//			We will have the following variables:
//			ints called a, b, c, and d equal to 5, 7, 12, and 50.
//			a final double equal to PI (8 decimal places).
//			a char equal to 'A'.
//			an int variable called 'variable'.  We will assign value later.
//			a boolean called 'check10', boolean = variable >= 10;
//			(use the the syntax above for the boolean)
//			Using the above variables (if names not specified, make your own and make them meaningful!)
//			we will print out some arithmetic and concatenation operations so we can see
//			the resulting calculations on our console.
//			Print the following:
//			a multiplied by b
//			c multiplied by PI
//			d divided by PI
//			your char + a
//			your char multiplied by a
//			intialize your 'variable' to = 5, print 'check10'
//			change 'variable' to = 15, print 'check10'
//			a modulus b
//			d modulus a
//			c divided by a
//			print the inverse of 'check10'
//			We will also have some time tomorrow to complete this.  This is just practice for using
//			arithmetic, logical operators, and final variables.
		
		// variables
		int a = 5;
		int b = 7;
		int c = 12;
		int d = 50;
		int variable = 0;
		// leaving variable "variable" uninitialized creates an error that doesn't allow me to run the program;
		// changed to 0 for now
		
		
		final double PI = 3.14159265d;
		
		char A = 'A';
		
		// this is the source of the exception; this equation is invalid because variable has no value
		// best practice is to set a initialize a default value like 0 or ' '
		boolean check10 = variable >= 10;
		
		// calculations
		System.out.println("Calculations: ");
		
		System.out.println("a multiplied by b = " + (a * b));
		System.out.println("c multiplied by PI = " + (c * PI));
		System.out.println("d divided by PI = " + (d / PI));
		System.out.println("A + a = " + (A + a));
		System.out.println("A multiplied by a = " + (A * a));
		
		// initialize variable "variable" and run check10 test
		System.out.println("\n");
		System.out.println("check10 for variable 'variable'");
		
		variable = 5;
		check10 = variable >= 10;
		System.out.println(check10);
		
		variable = 15;
		check10 = variable >= 10;
		System.out.println(check10);
		// it looks like there may be a problem here; 15 >= 10
			//fixed the issue by redeclaring the "check10" variable @ lines 64 and 68
		
		// more calculation
		System.out.println("\n");
		System.out.println("More calculations: ");
		System.out.println("a modulus b = " + (a % b));
		System.out.println("d modulus a = " + (d % a));
		System.out.println("c divided by a = " + (c / a));
		
		// 2nd check10
		System.out.println("\n");
		System.out.println("check10 inverse = " + (!check10));
		
		
		
	}

}
