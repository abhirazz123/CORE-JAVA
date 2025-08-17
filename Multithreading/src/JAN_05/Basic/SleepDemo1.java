package JAN_05.Basic;



class MyTest extends Thread{
	@Override
	public void run() {
		System.out.println("child thred id is : "+Thread.currentThread().getId());
		for(int i = 1; i<=5; i++) {
			System.out.println("i value is: "+i);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				System.out.println("Thread has interrupted");
			}
		}
		
	}
}
public class SleepDemo1 {
	public static void main(String[] args) {
		System.out.println("main thred id is: "+Thread.currentThread().getId());
		  MyTest m = new MyTest();
		  MyTest m2 = new MyTest();
		  m.start();
		  m2.start();
	}

}
