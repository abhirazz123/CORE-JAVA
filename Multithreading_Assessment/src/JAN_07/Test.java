package JAN_07;
class Test1 extends Thread{
	public void run() {
		for(int i=0; i<=10;i++) {
			System.out.println("Hello Welcome here... "+i);
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.start();
		
	}
}
