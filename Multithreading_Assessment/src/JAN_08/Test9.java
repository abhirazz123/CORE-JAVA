package JAN_08;
class MyThread2 implements Runnable{
	String str;
	public MyThread2() {
		
	}
	@Override
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.print(str+ " : "+i+" ");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class Test9 {
	public static void main(String[] args) {
		MyThread2 obj1 = new MyThread2();
		MyThread2 obj2 = new MyThread2();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}

}
