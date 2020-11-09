package com.cognixia.jump.corejava;

public class Loops {

	public static void main(String[] args) {

		// While Loop

		System.out.println("While Loop:");

		int count = 0;
		boolean condition = true;
		// start of loop
		while (condition) {

			if (count % 2 != 0) {
				System.out.println(count);
			}
			count++;
			// this condition ends the loop
			if (count % 25 == 0) {
				condition = false;
				// could also use "return;" or "break;"
			}
		}

		// Do - While
		System.out.println("\nDo - While Example:");

		int count1 = 0;
		do {
			System.out.println("In the loop " + count1);
			count1++;

		} while (count1 < 10);

		// For Loop
		System.out.println("\nFor Loops:");

		for (int i = 1; i <= 10; i++) {
			int x = 1;
			x += 1;
			System.out.println(i);
			System.out.println("x = " + x + "\n");
		}

		// Nested Loop
		System.out.println("\nNested Loops:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++)
			{
				System.out.println(i + " " + j);
			}

		}

	}

}
