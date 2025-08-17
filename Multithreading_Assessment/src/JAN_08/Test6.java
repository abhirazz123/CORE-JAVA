package JAN_08;

public class Test6 {
	public static void main(String[] args) {
		Runnable r = new  Runnable() {
			
			@Override
			public void run() {
				System.out.println("Cat");
				
			}
		};
		Thread t = new Thread(r) {
			@Override
			public void run() {
				System.out.println("Dog");
			}
		};
		t.start();
	}

}
