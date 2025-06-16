package NOV_15;

public class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		if (name == null || name.trim().isEmpty() || age <= 0) {
			System.out.println("Error Invalid Input");
			this.name = "Unknown";
			this.age = 1; // Default valid values
		} else {
			this.name = name;
			this.age = age;
		}
	}

	public void makeSound() {
		System.out.println("The animal makes a generic sound.");
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Lion extends Animal {
	private int maneLength;

	public Lion(String name, int age, int maneLength) {
		super(name, age);
		if (maneLength <= 0) {
			System.out.println("Error Invalid Input");
			this.maneLength = 1; // Default
		} else {
			this.maneLength = maneLength;
		}
	}

	@Override
	public void makeSound() {
		System.out.println("The lion roars loudly.");
	}

	@Override
	public void displayInfo() {
		System.out.println("Lion Details:");
		super.displayInfo();
		System.out.println("Mane Length: " + maneLength + " cm");
	}
}

class Elephant extends Animal {
	private float tuskLength;

	public Elephant(String name, int age, float tuskLength) {
		super(name, age);
		if (tuskLength <= 0) {
			System.out.println("Error Invalid Input");
			this.tuskLength = 1.0f; // Default
		} else {
			this.tuskLength = tuskLength;
		}
	}

	@Override
	public void makeSound() {
		System.out.println("The elephant trumpets.");
	}

	@Override
	public void displayInfo() {
		System.out.println("Elephant Details:");
		super.displayInfo();
		System.out.println("Tusk Length: " + tuskLength + " meters");
	}
}
