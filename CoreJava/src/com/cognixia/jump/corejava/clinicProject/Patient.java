package com.cognixia.jump.corejava.clinicProject;

public class Patient {

	// Attributes
	private String name;
	private String height;
	private int weight;
	private String bloodType;
    private boolean sick;
	
	// Constructor
	// initializes attributes to prevent errors later
	public Patient() {
		this.name = "";
		this.height = "";
		this.weight = 0;
		this.bloodType = "";
		this.sick = false;
	}
	// Overloaded constructor; input to change attributes
	public Patient(String name, String height, int weight, String bloodType, boolean sick) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
		this.sick = sick;
	}
	
	// getters and setters
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSick(boolean sick) {
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
	
	
}
