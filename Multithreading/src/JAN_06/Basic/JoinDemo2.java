package JAN_06.Basic;

class Alpha extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName(); // Alpha Thread is current thread 
		Beta b1 = new Beta();
		b1.setName("Beta Thread ");
		b1.start();
		try {
			b1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 1; i<5; i++) {
			System.out.println(i+" by "+name);
			
		}
	}
}
public class JoinDemo2 {
	public static void main(String[] args) {
		Alpha a1 = new Alpha();
		a1.setName("Alpha Thread ");
		a1.start();

	}

}
class Beta extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i = 1; i<=5; i++) {
			System.out.println(i+ " By "+name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}

		}
		System.out.println("Beta Thread Ended");
	}
}
