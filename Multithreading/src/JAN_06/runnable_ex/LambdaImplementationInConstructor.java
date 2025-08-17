package JAN_06.runnable_ex;

public class LambdaImplementationInConstructor {
	public static void main(String[] args) {
		new Thread(()-> 
		System.out.println(Thread.currentThread().getName())).start();
		new Thread(()->
		System.out.println(Thread.currentThread().getName()),"child1").start();
	}

}
