package com.cognixia.jump.corejava.classes;

public class Patient {
	
	// Attributes
	String name;
	int temperature;
	boolean sick;
	
	// Constructor
	// initializes attributes to prevent errors later
	public Patient() {
		this.name = "";
		this.temperature = 0;
		this.sick = false;
	}
	// input to change attributes
	public Patient(String name, int temperature, boolean sick) {
		this.name = name;
		this.temperature = temperature;
		this.sick = sick;
	}
	
	// Methods
	
	// getSick and getHealty toggle the boolean "sick"
	public void getSick() {
		this.sick = true;
	}
	
	public void getHealthy() {
		this.sick = false;
	}
	
	// Special Methods - getters and setters
	public void setName(String name) {
		this.name = name;
	}
}
