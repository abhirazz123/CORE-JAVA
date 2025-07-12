package NOV_14;
class Animal {
	private String Name;
	public Animal(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public void displayDetails() {
		System.out.println("Animal Name: "+ Name);
	}
}
class Mammal extends  Animal{
private boolean hasFur;
	public Mammal(String Name, boolean hasFur) {
		super(Name);
		this.hasFur = hasFur;

	}
	public boolean isHasFur() {
		return hasFur;
	}
	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	@Override
	public void displayDetails () {
		super.displayDetails();
		System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
	}
}
class Dog extends Mammal{
	private String breed;
	public Dog(String Name, boolean hasFur, String breed) {
		super(Name, hasFur);
	this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void displayDetails() {
		System.out.println("Dog Details:");
        super.displayDetails();
        System.out.println("Breed: " + breed);
	}
}
public class Main {
	public static void main(String[] args) {
		 Dog myDog = new Dog("Buddy", true, "Golden Retriever");
	        myDog.displayDetails();

	}

}
