package NOV_21;

public class Example {
	static {
		Example.a = m1();
	}

	static int a = 50;

	public static void main(String[] args) {
		System.out.println(a);
	}

	static {
		Example.a = Example.a+m1();
	}

	static int m1() {
		Example.a = 30;
		return m2();
	}

	static int m2() {
		System.out.println(a);
		return Example.a+20;
	}
}
