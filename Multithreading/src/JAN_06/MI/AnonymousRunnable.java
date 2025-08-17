package JAN_06.MI;
//Implementing run() method by using Anonymous inner class
public class AnonymousRunnable {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name);

			}
		};
		Thread t1 = new Thread();
		t1.start();
	}
}
