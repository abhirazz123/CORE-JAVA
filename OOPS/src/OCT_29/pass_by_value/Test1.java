package OCT_29.pass_by_value;

public class Test1 {
	public static void main(String[] args) {
		int x = 100;
		accept(x);
		System.out.println("x="+x);
	}

	private static void accept(int y) {
		y =200;
		System.out.println("y="+y);
	}

}
