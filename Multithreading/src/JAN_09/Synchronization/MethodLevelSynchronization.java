package JAN_09.Synchronization;
class Table{
	public synchronized void printTable(int num) {
		for(int i =1; i<=10; i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(num+" X "+i+" = "+(num*i));
		}
		String name = Thread.currentThread().getName();
		System.out.println(name+" thread is completed!! ");
	}
}

public class MethodLevelSynchronization {
	public static void main(String[] args) {
		
		Table obj = new Table();
		Thread t1 = new Thread(){
			public void run() {
				obj.printTable(5);
			}
		};
		Thread t2 = new Thread(){
			@Override
			public void run(){
				obj.printTable(10);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				obj.printTable(15);
			}
		};
		t1.start();
		t2.start();
		t3.start();

	}

}
