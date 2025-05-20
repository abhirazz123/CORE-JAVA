package Dec_05.Method_Hiding;
class Base{
	public static void m1() {
		System.out.println("static Method of Base class");
	}
}
class Derived extends Base{
	public static void m1() //Method Hiding [Static Polymorphism]
	{
		System.out.println("Static Method of Derived class");
	}
}
public class MethodHidingEx {
	public static void main(String[] args) {
		Base b = new Derived();
		b.m1();
	}
}
