package JAN_08;
class Mythred extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread run()");
	}
	public void start() {
		System.out.println("MyThread : start()");
	}
}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Myrunnable: start");
		
	}
}
public class Test7 {
	public static void main(String[] args) {
		Mythred myThred = new Mythred();
		MyRunnable myRunnable = new MyRunnable();
		Thread thred = new Thread(myRunnable);
		myThred.start();
		thred.start();
	}

}
