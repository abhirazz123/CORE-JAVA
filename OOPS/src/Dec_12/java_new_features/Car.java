package Dec_12.java_new_features;
public class Car implements Vehicle {
	@Override
	public void run() {
		System.out.println("Car is Runnaing ");
	}
	@Override
	public void horn() {
		System.out.println("Car is horn");
	}
	@Override
	public void digitalMeter() {//java 8
		System.out.println("Digital Meter Facility is Available in the Car");
	}
}
