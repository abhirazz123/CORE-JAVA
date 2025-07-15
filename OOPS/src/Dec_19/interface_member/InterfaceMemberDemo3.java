package Dec_19.interface_member;
@FunctionalInterface
abstract interface Moveable{
	void move();
	public String toString();
	public int hashCode();
	public boolean equals(Object obj);
}

public class InterfaceMemberDemo3 {
	public static void main(String[] args) {
		 // Lambda expression to implement Moveable
        Moveable m = () -> System.out.println("Moving...");

        // Call move() method
        m.move();

        // Object class methods
        System.out.println("toString: " + m.toString());
        System.out.println("hashCode: " + m.hashCode());
        System.out.println("equals self: " + m.equals(m));
	}

}
