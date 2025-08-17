package JAN_08;

public class Test2 extends Thread {
	static String name = "Ravi";

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test(name);
	System.out.println(""+name);
	}
	public void test(String name) {
		start();
		System.out.println("method");
	}
	public void run() {
		System.out.println("Run");
	}

}
