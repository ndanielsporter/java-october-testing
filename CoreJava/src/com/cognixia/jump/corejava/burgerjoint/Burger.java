package com.cognixia.jump.corejava.burgerjoint;

public class Burger {

	// Attributes
	private boolean hasMeat;
	private boolean hasBuns;
	private boolean hasLettuce;
	private boolean hasTomato;
	private boolean hasOnion;
	
	// Burger counter
	public static int count = 0;
	
	public Burger() {
		this.hasMeat = true;
		this.hasBuns = true;
		this.hasLettuce = true;
		this.hasTomato = true;
		this.hasOnion = true;
		count++;
	}

	// getters and setters
	public boolean isHasMeat() {
		return hasMeat;
	}

	public void setHasMeat(boolean hasMeat) {
		this.hasMeat = hasMeat;
	}

	public boolean isHasBuns() {
		return hasBuns;
	}

	public void setHasBuns(boolean hasBuns) {
		this.hasBuns = hasBuns;
	}

	public boolean isHasLettuce() {
		return hasLettuce;
	}

	public void setHasLettuce(boolean hasLettuce) {
		this.hasLettuce = hasLettuce;
	}

	public boolean isHasTomato() {
		return hasTomato;
	}

	public void setHasTomato(boolean hasTomato) {
		this.hasTomato = hasTomato;
	}

	public boolean isHasOnion() {
		return hasOnion;
	}

	public void setHasOnion(boolean hasOnion) {
		this.hasOnion = hasOnion;
	}
	
	
	
}
