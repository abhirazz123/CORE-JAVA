package Dec_04.Overriding;
class Super{
	public Super m1() {
		System.out.println("Super class method");
		return this;
	}
}
class Sub extends Super{
	public Sub m1() {
		System.out.println("Sub class method");
		return this;
	}
}
public class Co_Variant_return_type {
	public static void main(String[] args) {
		Super s = new Sub();
		s.m1();
	}
}
