package JAN_07;
class Foo1 implements Runnable{

	@Override
	public void run() {
		for(int i =0; i<3; i++) {
			System.out.println("Run by..."+Thread.currentThread().getName()+" ,i Is "+ i);
		}
	}
	public void run(String name ) {
		System.out.println("this is Second "+name);
	}
	
}

public class Test17 {
	public static void main(String[] args) {
		Foo1 f = new Foo1();
		Thread t = new Thread();
		try {
			System.out.println("Number Will be print Aftr 500 MiliScond");
			for(int j =0; j<5; j++) {
				System.out.println("This is J "+j);
				t.sleep(500);	
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException"+e);
			e.printStackTrace();
		}
	}

}
