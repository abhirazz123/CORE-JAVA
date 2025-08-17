package JAN_07;

public class Test12 extends Thread{
	public static void main(String[] args) {
		 Test12 b = new Test12();b.run();
		 b.start();
		 
	}
	public void start() {
		for(int i=0 ; i<5; i++) {
			System.out.println("Value of i : "+i);
		}
	}

}
