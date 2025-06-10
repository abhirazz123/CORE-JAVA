package Dec_13.static_method;
interface Alpha{
	static void m1() {
		System.out.println("Interface static method");
	}
}
class Beta implements Alpha{
}
public class StaticMethodOfInterface {
	public static void main(String[] args) {
		Alpha.m1();
		//Beta.m1();//[Invalid]
		Beta b = new Beta();
		//b.m1();//[Invalid]
	}
}
