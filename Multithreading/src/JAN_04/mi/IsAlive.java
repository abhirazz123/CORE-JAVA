package JAN_04.mi;
class Demo extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread is running in a separate Stack");
	}
}

public class IsAlive {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("Is child thread started before start(): "+d.isAlive());

	}

}
