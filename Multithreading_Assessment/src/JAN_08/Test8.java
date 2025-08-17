package JAN_08;
class MyThread extends Thread{
	String myName;
	public MyThread(String myName) {
		this.myName =  myName;
	}
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.print(" "+myName);
		}
	}
}
public class Test8 {
	public static void main(String[] args) {
		try {
			MyThread mt1 = new MyThread("mt1");
			MyThread mt2 = new MyThread("mt2");
			mt1.start();
			mt1.join();
			mt2.start();

		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}

