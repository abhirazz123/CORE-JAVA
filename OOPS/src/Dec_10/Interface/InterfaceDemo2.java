package Dec_10.Interface;
interface Bank {
	void deposite(double amount);
	void withdraw(double amount);
}
 class Customer implements Bank{
	double balance;
	public Customer(double balance) {
		super();
		this.balance = balance;
	}
	@Override
	public void deposite(double amount) {
		if(amount<=0) {
			System.err.println("Deposite is not possible");
		}
		else {
			this.balance= this.balance+amount;
			System.out.println("After deposite amount is:"+this.balance);
		}
	}
	@Override
	public void withdraw(double amount) {
		if(amount>= this.balance) {
			System.err.println("Insufficient Balance");
		}
		else {
			this.balance = this.balance-amount;
			System.out.println("Balance after withdraw :"+this.balance);
		}
	}
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		Bank bank = new Customer(1000);
		bank.deposite(10000);
		bank.withdraw(5000);
	}
}
