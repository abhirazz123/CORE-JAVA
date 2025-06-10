package Dec_12.exetnding_interface;
interface Alpha{
	void m1();
}
interface Beta extends  Alpha{
	void m2();
}
class Myclass implements Beta{
	@Override
	public void m1() {
		System.out.println("M1 method Overridden");
	}
	@Override
	public void m2() {
		System.out.println("M2 method Overridden");
	}
}
public class ExtendingInterfaceDemo {
	public static void main(String[] args) {
		Myclass m = new Myclass();
		m.m1();m.m2();
	}
}
