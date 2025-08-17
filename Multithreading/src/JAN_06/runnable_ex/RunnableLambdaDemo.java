package JAN_06.runnable_ex;

public class RunnableLambdaDemo {
	public static void main(String[] args) {
		Runnable r1 = ()-> {
			String name = Thread.currentThread().getName();
			System.out.println("Current Thread Name is "+name);

		};
		Thread t1 = new Thread(r1,"childe");
		t1.start();
	}
}
