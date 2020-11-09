package com.cognixia.jump.corejava.classes;

//if you were to inherit from a class outside the current package, you would import that class here:

public class Dog extends Animal {
// at this point, Dog now inherits from Animal based on "extends" keyword
	
	// declare attributes - objects or primitives
		private String breed;
		// the object existing in another class is composition
		private MicroChip chip;
		
		public Dog() {
			super("", 0, 0, true, false);
			this.breed = "";
			this.chip = new MicroChip();
		}

		public Dog(String breed) {
			super("", 0, 0, true, false);
			this.breed = breed;
			this.chip = new MicroChip();
		}
		
		public Dog(String breed, String type, double weight, double height, boolean isDomestic, boolean isPredator) {
			super(type, weight , height, isDomestic, isPredator);
			this.breed = breed;
			this.chip = new MicroChip();
		}

		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}
		
		//Methods
		// method override - runtime polymorphism
		
		public MicroChip getChip() {
			return chip;
		}

		public void setChip(MicroChip chip) {
			this.chip = chip;
		}

		@Override
		public void sound(String noise) {
			System.out.println("We override here");
			System.out.println("A dog goes: " + noise);
		}	
		
		// Method Overloading - compile time polymorphism
		public String sound(String noise, int volume) {
			String string = "";
			for(int i = 0; i < volume; i++) {
				string+=(" " + noise);
			}
			return string;
		}
	
}
