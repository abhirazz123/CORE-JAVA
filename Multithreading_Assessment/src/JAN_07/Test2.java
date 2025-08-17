package JAN_07;

public class Test2 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("Name of Thread: "+t.getName());
		System.out.println("Id of Thread "+t.getId());
	}

}
