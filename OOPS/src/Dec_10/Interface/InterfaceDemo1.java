package Dec_10.Interface;
sealed interface Moveable permits Car{
	int SPEED = 100; // public +static+ final
	void move(); // public + abstract
}
non-sealed class Car implements Moveable{
	@Override
	public void move() {
		//SPEED = 120; [invalid]
		System.out.println("Car is Moving with:"+ SPEED+ "KM/Hr");
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Moveable m = new Car();
		System.out.println("SPEED of Car is : "+Moveable.SPEED);
		m.move();
	}
}
