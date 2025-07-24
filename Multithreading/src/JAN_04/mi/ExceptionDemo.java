package JAN_04.mi;
class Stuff extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Child Thread is Running, name is :"+name);
	}
}

public class ExceptionDemo {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println(name+" thred started");
		Stuff s1 = new Stuff();
		Stuff s2 = new Stuff();
		s1.start();
		s2.start();
		System.out.println(10/0);
		System.out.println("Main Thread Ended");
	}

}
