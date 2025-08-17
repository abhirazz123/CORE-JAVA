package JAN_06.runnable_ex;
class Customber implements Runnable{
	private int availableSeat = 10;
	private int wantedSeat ;
	
	public Customber(int wantedSeat) {
		this.wantedSeat = wantedSeat;
	}

	@Override
	public void run() {
		String name = null;
		if(availableSeat >= wantedSeat) {
			name = Thread.currentThread().getName();
			System.out.println(wantedSeat+ " berth is reserved "+availableSeat);
			availableSeat -=wantedSeat;
			System.out.println("Current Available Seat is "+availableSeat);
		}else {
			System.err.println("Available Seat is : "+ availableSeat);
			name = Thread.currentThread().getName();
			System.out.println("Sorry!!"+name+ "berth is not avaliable");
			System.out.println("There are Available only "+availableSeat+" Seat");
		}
		
	}
}

public class RailwayReservation {
	public static void main(String[] args) {
		Customber c1 = new Customber(11);
		Thread t1 = new Thread(c1,"Scott");
		Thread t2 = new Thread(c1,"Smith");
		
		t1.start();
		
	}

}
