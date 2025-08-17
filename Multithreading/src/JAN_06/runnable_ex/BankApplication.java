package JAN_06.runnable_ex;
class Customer{
	private double availableBalance = 2000;
	private double withdrawAmount;
	public Customer(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public void withdraw() {
		String name = null ;
		if(withdrawAmount <= availableBalance) {
			name = Thread.currentThread().getName();
			System.out.println(name+" has successfully wihdrawAmount "+withdrawAmount+" Amount");
			availableBalance = availableBalance-withdrawAmount;
			System.out.println(name+" available Balance: "+availableBalance+" Amount");
			
		}else {
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!!"+name+" you have insufficient balance ");
			System.out.println(name+" available Balance is : "+availableBalance+" onlye");

		}
	}
}

public class BankApplication {
	public static void main(String[] args) {
		Customer c1 = new Customer(2500);
		Runnable r1 = ()->c1.withdraw();
		
		Thread t1 = new Thread(r1,"Scott");
		Thread t2 = new Thread(r1,"Smith");
		t1.start();
	}

}
