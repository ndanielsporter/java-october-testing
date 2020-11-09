package com.cognixia.jump.corejava.burgerjoint;

public class Cook extends Cashier {

	// attributes
	private String name;
	
	// methods
	public Burger makeBurger() {
		return new Burger();
	}
	
	public void cleanStand () {
	System.out.println("The stand is clean!");	
	}
	
	public void takeOrder (String order) {
		System.out.println("Your order is " + order);
	}
	
	public void beCashier () {
		// Override to Cashier?
	}

	// getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
