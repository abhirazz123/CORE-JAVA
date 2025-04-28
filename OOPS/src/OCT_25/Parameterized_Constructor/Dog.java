package OCT_25.Parameterized_Constructor;

public class Dog {
	private String dogName;
	private double dogHEight;
	private int dogAge;
	
	public Dog(String dogName, double dogHEight, int dogAge) {
		this.dogName = dogName;
		this.dogHEight = dogHEight;
		this.dogAge = dogAge;
	}

	@Override
	public String toString() {
		return "Dog [Dog Name=" + dogName + ", Dog Height=" + dogHEight + ", Dog Age=" + dogAge + "]";
	}
	public static void main(String[] args) {
		Dog dog = new Dog("Tomy", 5.5, 5);
		System.out.println(dog);
	}

}
