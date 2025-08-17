package JAN_07;

public class Test9 {
	public static void main(String[] args) {
		try {
			Horse3 h = new Horse3();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			new Test9().go(t2);
			t1.start(); t2.start();

		} catch (Exception e) {
			System.out.println(e);
	
		}
	}
	void go(Thread t) {
		t.start();
	}

}
class Horse3 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" ");

	}

}
