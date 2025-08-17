package JAN_06.Basic;
class Tatkal implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is booking ticket under Tatkal Scheme");
		
	}
}
class PremimumTatkal implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" is booking ticket under PremimumTatkal Scheme");
		
	}
	
}
public class RunnableDemo2 {
	public static void main(String[] args) {
		Thread t2 = new Thread( new PremimumTatkal(),"Smith");
		t2.start();
		
		Thread t1 = new Thread(new Tatkal(),"Scoth");
		t1.start();
		
		Thread t3 = new  Thread(new Tatkal(),"Martin");
		t3.start();
	}

}
