package com.cognixia.jump.corejava.abstractAndInterfaces;

public abstract class Athlete {

	// we cannot instantiate this class (make objects) but we can inherit from it
	
	// attributes
	private String name;
	
	// methods
	// concrete (implemented [logic present in curly braces]) method
	public void move() {
		System.out.println("Athlete moved");
	}
	
	// abstract method (no option to include logic)
	public abstract void stop();
	
}
