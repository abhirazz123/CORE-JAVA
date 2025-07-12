package DEC_06;
class Vehicle {
	public void printSound() {
		System.out.print("vehicle");
	}
}

class Car extends Vehicle {
	@Override
	public void printSound() {
		System.out.print("car ");
	}
}

class Bike extends Vehicle {
	@Override
	public void printSound() {
		System.out.print("bike");
	}
}

public class Test14 {
	public static void main(String[] args) {
		Vehicle v = new Car();
		Car c = (Car) v;

		v.printSound();
		c.printSound();
	}
}
