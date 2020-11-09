package com.cognixia.jump.corejava.arraysAndCollections;

import java.util.Arrays;

public class LoopToArrayEx {

	public static void main(String[] args) {
		
		int[] array100 = new int[100];

		for (int i = 0; i < array100.length; i++) {
		  array100[i] = i + 1;
		}
		

		System.out.println(Arrays.toString(array100));
		
	}	
}
