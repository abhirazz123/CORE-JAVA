package JAN_08;

public class Test10 {
	public static void main(String[] args) {
		new Test10().go();
	}
	public void go() {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("foo");
				
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.run();
	}

}
