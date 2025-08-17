package JAN_06.Basic;

public class AnonymousThreadWithReference2 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name+" thred is running Hare ");
			}
		}.start();	
		
	}
}
