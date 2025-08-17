package JAN_07;
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello world");
		}
	}
}
public class Test19 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println("ERROR: Threa d was interrupted");
		}
		System.out.println();
	}

}
