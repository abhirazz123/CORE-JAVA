package JAN_06.runnable_ex;

public class RunnableImplementationUsingConstructorWithoutRef2 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("Current Thread Name is: "+name);
				
			}
		}).start();
	}
}
