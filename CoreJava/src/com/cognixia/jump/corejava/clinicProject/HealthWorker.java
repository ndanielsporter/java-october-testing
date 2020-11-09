package com.cognixia.jump.corejava.clinicProject;

public class HealthWorker {

	// Attributes
	private String name;
	
	// Methods
	public void runTests() {
		System.out.println(name + " is running tests on the patient.");
	}
	
	public void treatSick(Patient patient) {
		System.out.println(name + " is treating the patient.");
		patient.getHealthy();
	}
	
}
