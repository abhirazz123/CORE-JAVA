package Dec_04.Overriding;
class Animal2{
	public void roam() {
		System.out.println("Generic Animal is roaming");
	}
}
class Lion2 extends Animal2{
	public void roam() {
		System.out.println("Lion Animal is roaming");
	}
	public void roar()
	{
		System.out.println("Lion is roaring");
	}
}
class Doge2 extends Animal2{
	public void roam() {
		System.out.println("Dog Animal is roaming");
	}
	public void bark() {
		System.out.println("Dog is Barking");
	}
}

public class How_to_call_specific_method_of_sub_class {
	public static void main(String[] args) {
		Animal2 a = new Lion2();
		animalRoam(a);

	}
	public static void animalRoam(Animal2 anmial) {
		Lion2 lion = (Lion2) anmial;
		lion.roam();
		lion.roar();
	}

}
