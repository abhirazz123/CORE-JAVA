package OCT_25.data_hiding;

public class Customer {
	private double balance  = 10000;
	
	public void Deposit(double amount) {
		if(amount<0) {
			System.out.println("Amount con't deposited");
		}
		else {
			this.balance = this.balance+amount;
			System.out.println("After deposite: "+this.balance);
		}
	}
	public void Withdraw(double amount) {
		this.balance = this.balance-amount;
		System.out.println("After Withdraw: "+this.balance);
		
	}

}
