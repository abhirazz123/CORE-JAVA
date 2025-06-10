package Dec_12.java_new_features;
public interface Vehicle {
	void run();
	void horn();
	default void digitalMeter() { //java 8
		System.out.println("Default Implementation");
		System.out.println("Digital Meter Facility is coming soon");
	}
}
