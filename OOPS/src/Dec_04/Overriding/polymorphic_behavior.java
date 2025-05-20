package Dec_04.Overriding;
class Animal{
	public void roam() {
		System.out.println("Generic Animal is roaming");
	}
}
class Lion extends Animal{
	public void roam() {
		System.out.println("Lion Animal is roaming");
	}
}
class Dog extends Animal{
	public void roam() {
		System.out.println("Dog Animal is roaming");
	}
}
public class polymorphic_behavior {
	public static void main(String[] args) {
		Animal a = null;
		a = new Lion();
		animalRoam(a);
		
		a = new Dog();
		animalRoam(a);
	}
	public static void animalRoam(Animal animal) {
		animal.roam();
	}
}
