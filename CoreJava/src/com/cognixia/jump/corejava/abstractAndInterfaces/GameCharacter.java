package com.cognixia.jump.corejava.abstractAndInterfaces;

public interface GameCharacter {
	
	// attributes - they are always public static final (for interfaces)
	int MAX_SPEED = 100;
	
	// methods - they are always abstract (for interfaces)
	public int move(int x, int y);
	public int jump(int strength);
	public int attack(int strength);
	public int run(int dexterity);
	public int defend(int vitality);
	public String speak(String message);
}
