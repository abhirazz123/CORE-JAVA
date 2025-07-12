package Dec_13.lambda;
interface Vachile{
	void run();
}
public class LambdaDemo1 {
	public static void main(String[] args) {
		Vachile car = ()->System.out.println("Car is Running ");
		car.run();
		Vachile Bike =()-> System.out.println("Bike is Running");
		Bike.run();
				
		
	}
}
