package JAN_07;

public class Test13 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						System.out.println("Hello, world");
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
						System.out.println("good by "+" Beautiful world!!");
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		};
		Thread thr1 = new Thread();
				
	}


}
