package Dec_12.java_new_features;
public class Bike implements Vehicle {
	@Override
	public void run() {
		System.out.println("Bike is running");
	}
	@Override
	public void horn() {
		System.out.println("Bike has horn");		
	}
}
