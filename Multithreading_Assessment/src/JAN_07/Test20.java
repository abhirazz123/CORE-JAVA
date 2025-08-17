package JAN_07;

public class Test20 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thred started");
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		
		for(int i = 1 ; i<5; i++) {
			System.out.println(i+" by "+name+" thred");
			Thread.sleep(1000);
			thread.join();
		}
		System.out.println("Main thread ended");
	}


}
