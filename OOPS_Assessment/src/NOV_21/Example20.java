package NOV_21;

public class Example20 {
	static int a;
	
	public static void main(String[] args) {
		System.out.println(Example20.a);
		Example20.a = Example20.initialize();
		System.out.println(Example20.a);
	}

	static int initialize() {
		Example20.a = 50;
		return 60;
	}
}
