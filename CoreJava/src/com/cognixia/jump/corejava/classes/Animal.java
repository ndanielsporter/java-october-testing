package com.cognixia.jump.corejava.classes;

public class Animal {

	//Attributes
		private String type;
		private double weight;
		private double height;
		private boolean isDomestic;
		private boolean isPredator;
		
		//static attribute
		public static int count = 0;
		
		//Constructors - also show absent / default constructor
		public Animal() {
			this.type = "";
			this.weight = 0;
			this.height = 0;
			this.isDomestic = false;
			this.isPredator = false;
			count++;
		}

		public Animal(String type, double weight, double height, boolean isDomestic, boolean isPredator) {
			this.type = type;
			this.weight = weight;
			this.height = height;
			this.isDomestic = isDomestic;
			this.isPredator = isPredator;
			count++;
		}	

		public Animal(String type) {
			this.type = type;
			this.weight = 0;
			this.height = 0;
			this.isDomestic = false;
			this.isPredator = false;
			count++;
		}

		// Methods
		public void sound(String noise) {
			System.out.println("This is our Original");
			System.out.println("Animal sound is " + noise);
		}
		
		
		// Getters and Setters
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public boolean isDomestic() {
			return isDomestic;
		}

		public void setDomestic(boolean isDomestic) {
			this.isDomestic = isDomestic;
		}

		public boolean isPredator() {
			return isPredator;
		}

		public void setPredator(boolean isPredator) {
			this.isPredator = isPredator;
		}
		
		public static void printAnimals() {
			System.out.println("Animals");
		}

		@Override
		public String toString() {
			return "Animal [type=" + type + ", weight=" + weight + ", height=" + height + ", isDomestic=" + isDomestic
					+ ", isPredator=" + isPredator + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(height);
			result = prime * result + (int) (temp ^ (temp >>> 32)); // >>> bitwise operators
			result = prime * result + (isDomestic ? 1231 : 1237);
			result = prime * result + (isPredator ? 1231 : 1237);
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			temp = Double.doubleToLongBits(weight);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Animal other = (Animal) obj;
			if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
				return false;
			if (isDomestic != other.isDomestic)
				return false;
			if (isPredator != other.isPredator)
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
				return false;
			return true;
		}
	
}
