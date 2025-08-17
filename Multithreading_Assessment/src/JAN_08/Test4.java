package JAN_08;
class Mydata extends Thread{
	private boolean request;
	private String data ;
	@Override
	public void run() {
		storeMessage("Hello");
		String str = retrieveMessage();
		System.out.println(str);
	}
	public synchronized void storeMessage(String data) {
		request = true;
		this.data = data;
	}
	public synchronized String retrieveMessage() {
		return data+":"+request;
		
	}
}

public class Test4 {
	public static void main(String[] args) {
		Mydata md = new Mydata();
		md.start();
	}

}
