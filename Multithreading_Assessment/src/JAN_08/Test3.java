package JAN_08;
class job extends Thread{
	private Integer number = 0;
	public void run() {
		for(int i=1; i<100000;i++) {
			number++;
		}
	}
	public Integer getNumber() {
		return number;
	}
}

public class Test3 {
	public static void main(String[] args) {
		job thred = new job();
		thred.start();
		try {
			thred.join();
		} catch (Exception e) {
			
		}
		System.out.println("Final number = "+thred.getNumber());
	}

}
