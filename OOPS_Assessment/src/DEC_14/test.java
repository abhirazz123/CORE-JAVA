package DEC_14;
interface intf{
	public void m1();
}

public class test {
	int x = 10;
	public void m2() {
		int y = 20;
		intf i = ()->{
			 x = 8888;
			System.out.println(x);
			System.out.println(y);

		};
		i.m1();
	}
	public static void main(String[] args) {
		test t = new test();
		t.m2();

	}

}
