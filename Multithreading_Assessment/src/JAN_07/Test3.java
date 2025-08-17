package JAN_07;

public class Test3 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("tesk one");
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println("task two");
			}
		}.start();
	}

}
