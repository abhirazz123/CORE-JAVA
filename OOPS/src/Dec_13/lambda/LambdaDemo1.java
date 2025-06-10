package Dec_13.lambda;
interface Vechile{
	void run();
}
public class LambdaDemo1 {
	public static void main(String[] args) {
		Vechile car = ()-> System.out.println("Car is Runnaing");
		car.run();
		Vechile Bike = ()->System.out.println("Bike is Running");
		Bike.run();
	}
}
