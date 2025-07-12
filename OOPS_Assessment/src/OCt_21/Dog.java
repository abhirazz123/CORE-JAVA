package OCt_21;

public class Dog {

	String name;
	double height;
	int age;

	public Dog(String name, double height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}
	public void getDogInformation() {
		System.out.println("Dog Name: " + name);
		System.out.println("Dog Height: " + height + " cm");
		System.out.println("Dog Age: " + age + " years");
	}
	public void bark() {
		System.out.println(name + " says: Woof! Woof!");
	}

	public static void main(String[] args) {
		Dog myDog = new Dog("Buddy", 60.5, 5);
		myDog.getDogInformation();
		myDog.bark();
	}
}

