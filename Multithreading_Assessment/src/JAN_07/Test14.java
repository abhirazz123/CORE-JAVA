package JAN_07;

public class Test14 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						System.out.println("Hello, world!");
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					
				}
			}
		};
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						System.out.println("Goodbye, " +" Beautiful world!");
						Thread.sleep(2000);
					}
				} catch (InterruptedException e) {
					
				}
				
			}
		};
		Thread thr1 = new Thread(r1);
		Thread thr2 = new Thread(r2);
		thr1.start();
		thr2.start();
	}

}
