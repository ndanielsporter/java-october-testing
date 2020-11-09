package com.cognixia.jump.corejava.abstractAndInterfaces;

public class OddJob extends PlayableCharacter implements GameCharacter {

	@Override
	public int move(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int jump(int strength) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int attack(int strength) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int run(int dexterity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defend(int vitality) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String speak(String message) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
