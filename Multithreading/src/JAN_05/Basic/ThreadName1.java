package JAN_05.Basic;
class Demo extends Thread{
	@Override
	public void run() {
		String name =  Thread.currentThread().getName();
		System.out.println("Running thred name is : " +name );
	}
}

public class ThreadName1 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("prent");
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		d1.setName("child1");
		d2.setName("child2");
		d1.start();
		d2.start();
	}

}
