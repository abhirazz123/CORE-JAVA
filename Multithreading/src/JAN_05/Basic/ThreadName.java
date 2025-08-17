package JAN_05.Basic;
class DoStuff extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread is "+name );
	}
}
public class ThreadName {
	public static void main(String[] args) {
		DoStuff d = new DoStuff();
		DoStuff d2 = new DoStuff();
		d.start();
		d2.start();
		System.out.println(Thread.currentThread().getName()+ " thred is running");
	}

}
