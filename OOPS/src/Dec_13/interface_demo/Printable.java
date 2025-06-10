package Dec_13.interface_demo;
@FunctionalInterface
public interface Printable {
	void print();//[SAM = Single Abstract Method]
	default void m1() {

	}
	static void m3() {

	}
}
