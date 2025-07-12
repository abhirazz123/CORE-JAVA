package DEC_06;
class Super4{
	public void access(long x) {
		System.out.println("Widening");
	}
}
class Sub4 extends Super4{
	public void access(Integer x) {
		System.out.println("Autoboxing");
	}
}
public class OverloadingWithSuperAndSub {
	public static void main(String[] args) {
		Sub4 s = new Sub4();
		s.access(30);
	}
}
