// 	WAP to force the sub class developer to implement super class abstract method by using Array concept
package Dec_09.Abstraction;
abstract class Animal{
	public abstract void checkup();
}
class Lion extends Animal{
	protected String name ;
	public Lion(String name) {
		super();
		this.name = name;
	}
	@Override
	public void checkup() {
		System.out.println(name+ "Lion is going for Checkup");	
	}
}
class Elephant extends Animal{
	protected String name ;
	public Elephant(String name) {
		super();
		this.name = name;
	}
	@Override
	public void checkup() {
		System.out.println(name+ "Elephant is going for Checkup");
	}
	
}
class Horse extends Animal{
	protected String name ;
	public Horse(String name) {
		this.name = name;
	}
	public void checkup() {
		System.out.println(name+ "Horse is going for Checkup");
	}
}
public class AbstractDemo5 {
	public static void main(String[] args) {
		
		Lion lion [] = { new Lion("Erawat"), new Lion("Mylion") };
		Elephant elephant[] = { new Elephant("Erawat"),new Elephant("Jambo")};
		Horse horse []= {new Horse( "Chetak"), new Horse("MyHorse")};
		
		visitZooForCheckup(lion);
        System.out.println("..................");
        visitZooForCheckup(elephant);
        System.out.println("..................");
        visitZooForCheckup(horse);

	}
	public static void visitZooForCheckup(Animal ...animals ) {
		for(Animal animal : animals) {
			animal.checkup();
		}
	}
}
