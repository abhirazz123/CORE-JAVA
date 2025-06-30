package DEC_05;
class Animal {
	private String species ;
	
	public Animal(String species) {
		this.species = species;
	}
	public String getSpecies() {
		return species;
		
	}
	public void makeSound() {
		System.out.println("generic animal sound.");
	}
	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}
	public Animal reproduce() {
		 System.out.println("Generic reproduction method for all animals.");
		return new Animal("Unknown") ;
		
	}

}
class Mammal extends Animal{
	boolean 	hasFur ;
	public Mammal(String species, boolean hasFur) {
		super(species);
		
		this.hasFur = hasFur;
	}
	public void	makeSound() {
		System.out.println("mammal-specific sound.");
	}
	@Override
	public String toString() {
		return "Mammal [hasFur=" + hasFur + "]";
	}
	public Mammal reproduce() {
		 System.out.println("Mammals give birth to live young.");
		 return new Mammal(getSpecies(), hasFur);
		
	}
	public void nurseYoung() {
		System.out.println("Mammals nurse their young.");
	}

}
class Bird  extends Animal{
	boolean	canFly ;
	public Bird(String species, boolean canFly) {
		super(species);
		this.canFly = canFly;
	}
	public void	makeSound() {
		System.out.println("bird-specific sound");
	}
	@Override
	public String toString() {
		return "Bird [canFly=" + canFly + "]";
	}
	public Bird reproduce() {
		return new Bird(getSpecies(), canFly);
		
	}
	public void buildNest() {
		System.out.println("Birds build nests for their eggs.");
	}
}


public class ZooSimulation {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Lion", true);
        System.out.println("--- Mammal ---");
        lion.makeSound();
        System.out.println(lion);
        Mammal babyLion = lion.reproduce();
        babyLion.nurseYoung();

        System.out.println();

        Bird eagle = new Bird("Eagle", true);
        System.out.println("--- Bird ---");
        eagle.makeSound();
        System.out.println(eagle);
        Bird babyEagle = eagle.reproduce();
        babyEagle.buildNest();
    }
}