package JAN_06.runnable_ex;

public class RunnableImplementationUsingConstructor {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("Current Thread is "+name);
				
			}
		});
		t1.start();
	}

}
