package com.cognixia.jump.corejava.classes;

public class ClinicDriver {

	public static void main(String[] args) {
		
		// Create some patient objects
		// we need the "new" keyword to set aside space in memory
		// then we call one of our constructors to build our object
		
		// standard syntax for making objects and initializing
		// 	-"Patient" is a custom data type that we have just created in the Patient.java file
		Patient mike = new Patient("Mike", 97, false);
		// doing Patient mike = new Patient(); would assign default values from constructor
		
		// Test print the names
		System.out.println(mike.name);

		// Use some of our methods
		System.out.println(mike.sick + " " + mike.temperature);
		// this method makes our patient sick; patient is now sick
		mike.getSick();
		System.out.println(mike.sick + " " + mike.temperature);
		// this method makes our patient sick; patient is now healthy
		mike.getHealthy();
		System.out.println(mike.sick + " " + mike.temperature);
		
		// loop for patient getting sick
		for(int i = 1; i <= 2; i++) {
			
		}
		
	}

}
