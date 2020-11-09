package com.cognixia.jump.corejava.collections;

public class WrapperClassesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 8 types of primitives
		// they are scared and vulnerable
		// they don't live in heap memory by themselves
		// must be protected in an object
		int i = 0;
		short s = 0;
		long l= 0;
		byte b= 0;
		float f= 0;
		double d= 0;
		char c = ' ';
		boolean bo = false;
		
		// Wrapper classes are the solution!
		// reference the prim var from above
		
		// autobox means i was able to make object just using =
		Integer I = i;
		Short S = s;
		Long L= l;
		Byte B= b;
		Float F= f;
		Double D= d;
		Character C = c;
		Boolean Bo = bo;
		
		String input = "5";
		String input2 = "false";
		// Convert the String to Integer, and then from Integer to int
		int newInt = Integer.valueOf(input);
		boolean newBool = Boolean.valueOf(input2);

		System.out.println(!newBool);
		System.out.println(newInt + 1);
	}

}