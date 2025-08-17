package JAN_08;
public class Test5 extends Thread {
	public static void main(String[] args) {
		Test5 t = new   Test5();
		t.start();
		t.method();
		
	}
	@Override
	public void run() {
		System.out.println("run");
	}
	public void method () {
		hello();
		System.out.println("Hello");
	}
	public void hello() {
		hello1();
		System.out.println("PR");
	}
	public void hello1() {
		System.out.println("PR");
	}
	

}
