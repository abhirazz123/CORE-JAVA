package JAN_06.Basic;

public class AnonymousThreadWithReference {
	public static void main(String[] args) {
		Thread t1 = new  Thread() {
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name+" thread is running Here.");
			}
		};
		t1.start();
		String name = Thread.currentThread().getName();
		System.out.println("Currenty Executing thread name is: "+name);
	}

}
