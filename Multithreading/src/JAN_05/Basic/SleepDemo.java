package JAN_05.Basic;
class Sleep extends Thread{
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println("I valu is: "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread is interrupted "+e);
			}
		}
	}
}
public class SleepDemo {
	public static void main(String[] args) {
		Sleep s1 = new Sleep();
		s1.start();
	}

}
