package NOV_15;

public class ZooManagement {
	public static void main(String[] args) {
		Lion lion = new Lion("Simba", 5, 20);
		lion.displayInfo();
		lion.makeSound();

		System.out.println();

		Elephant elephant = new Elephant("Jumbo", 10, 2.5f);
		elephant.displayInfo();
		elephant.makeSound();
	}
}
