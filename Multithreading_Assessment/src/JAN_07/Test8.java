package JAN_07;

public class Test8 {
	public static void main(String[] args) {
		try {
			Horse2 h = new Horse2();
			Thread t1 = new Thread(h,"MyHorse");
			Thread t2 = new Thread(h,"YourHorse");
			new Test8().go(t2);
		
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
	void go(Thread t) {
		t.start();
	}

}
class Horse2 implements  Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}