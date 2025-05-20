package Dec_04.Overriding;
class A{
	public Object m1() {
		System.out.println("Super class m1 method");
		return this;
	}
}
class B extends A{
	public System m1() {
		System.out.println("Sub class m1 method");
		return null;
	}
}
public class execution {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}
}
