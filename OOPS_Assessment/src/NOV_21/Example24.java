package NOV_21;

public class Example24 {
	static {
		Example24.a = m1();
	}

	static int a = 50;

	public static void main(String[] args) {
		System.out.println(a);
	}

	static {
		Example24.a = Example24.a+m1();
	}

	static int m1() {
		Example24.a = 30;
		return m2();
	}

	static int m2() {
		System.out.println(a);
		return Example24.a+20;
	}
}
