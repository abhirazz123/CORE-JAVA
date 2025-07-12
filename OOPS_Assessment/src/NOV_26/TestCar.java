package NOV_26;
import java.util.Scanner;
class Engine {
	private String model;

	public Engine (String model) {
		this.model = model;
	}
	public String getModel() {
		return model;

	}
	@Override
	public String toString() {
		return  model;
	}
}

class Car {
	private String make;
	private String model;
	private Engine engine ;

	public Car(String make, String model, Engine engine) {
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}
}


public class TestCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Engine CC (numeric): ");
        int cc = sc.nextInt();
        sc.nextLine();

        if (cc <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }


        Engine engine = new Engine("V6 Hybrid");
        Car car = new Car("Hyundai", "Camry", engine);
        System.out.println(car);
    }
}
