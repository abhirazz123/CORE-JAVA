package JAN_07;

public class Test16  extends Thread{
	@Override
	public void run() {
		System.out.println("PRINT ME");
	}
	public static void main(String[] args) {
		try {
			for(int i=0;i<9;i++) {
				System.out.print(i+",");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Thred exception");
		}
		Thread t = new Thread();
		t.start();
	}

}
