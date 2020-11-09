package com.cognixia.jump.corejava.classes;

public class Calculator {
	
	// methods
	public static int sum(int a, int b) {
	return a + b;
	}
	
	// method overloading for sum()
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static int difference(int a, int b) {
		return a - b;
	}
	
	public static int product(int a, int b) {
		return a * b;
	}
	
	public static int quotient(int a, int b) {
		return (a / b) + (a % b);
	}
	
	
}
