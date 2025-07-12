package DEC_06;
class Super3{
	public void access(int ...x) {
		  System.out.println("Var args method :"+x[0]);
	}
}
class Sub3 extends Super3{
	public void access(int x) {
		System.out.println("instance method: "+x);
	}
}
public class Test19 {
	public static void main(String[] args) {
		Super3 s = new Super3();
		s.access(10);

		Sub3 s3 = new Sub3();
		s3.access(20);

		Super3 s4 = new Sub3();
		s4.access(30);
	}
}
