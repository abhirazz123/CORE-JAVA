package Dec_04.Overriding;
class Vechicle{
	public int getHorePower() {
		return 1000;
	}
	public void printHorePower() {
		System.out.println("Vechile Horse Power: "+this.getHorePower());
	}
}
class car extends Vechicle{
	public int getHorePower() {
		return 1200;
	}
	public void printHorePower() {
		System.out.println("Car Hores Power: "+this.getHorePower());
	}
}
public class polymorphic_behavior2 {
	public static void main(String[] args) {
		Vechicle v1 = new car();
		v1.printHorePower();			
	}
}
