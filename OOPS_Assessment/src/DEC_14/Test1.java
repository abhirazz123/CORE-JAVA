package DEC_14;
class Example{
	int x = 10;
	public void m1(int p) {
		p =50;
	}
	public void m2(Example e) {
		e = new Example();
	}
	public void m3(Example e) {
		e.x = 15;
		
	}
	public void m4(Example e) {
		e = new Example();
		e.x= 16;
	}
	public void m5(Example e) {
		e.x=19;
		e = new Example();
		e.x= 20;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Example e1 = new Example();
		int q =18;
		System.out.println("Q="+q);
		e1.m1(q);
		System.out.println(q);
		
		Example e2 = new Example();
		
	}

}
