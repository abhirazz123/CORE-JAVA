package DEC_11;
interface Bank{
	public void deposit(double amount);
	public void withdraw(double amount);
	public double checkBalance();

}
class SBI implements Bank{
	private double accountBalance;
	@Override
	public void deposit(double amount) {
		if(amount>=0) {
			accountBalance += amount;
			System.out.println("SBI: deposit : " + amount);
		}
		else {
			System.out.println("Error deposit");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount<accountBalance) {
			accountBalance -= amount;
			System.out.println("SIB: withdraw " + amount);
		}
		else {
			System.out.println("SBI: Insufficient funds.");
		}
	}
	@Override
	public double checkBalance() {
		return accountBalance;	
	}
}
class HDFC implements Bank{
	private double accountBalance;
	public void deposit(double amount) {
		if(amount>=0) {
			accountBalance += amount;
			System.out.println("HDFC: deposit : " + amount);
		}
		else {
			System.out.println("Error deposit");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount<accountBalance) {
			accountBalance -= amount;
			System.out.println("HDFC: withdraw " + amount);
		}
		else {
			System.out.println("HDFC: Insufficient funds.");
		}
	}
	@Override
	public double checkBalance() {
		return accountBalance;	
	}
}

class ICICI implements Bank{
	private double accountBalance;
	public void deposit(double amount) {
		if(amount>=0) {
			accountBalance += amount;
			System.out.println("ICICI: deposit : " + amount);
		}
		else {
			System.out.println("Error deposit");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount<accountBalance) {
			accountBalance -= amount;
			System.out.println("ICICI: withdraw " + amount);
		}
		else {
			System.out.println("ICICI: Insufficient funds.");
		}
	}
	@Override
	public double checkBalance() {
		return accountBalance;	
	}
}
class Customer {
	private String name;
	private double accountBalance;

	public Customer(String name) {
		this.name = name;
		this.accountBalance = 0;
	}

	public void deposit(Bank bank, double amount) {
		bank.deposit(amount);
	}

	public void withdraw(Bank bank, double amount) {
		bank.withdraw(amount);
	}

	public void checkBalance(Bank bank) {
		System.out.println(name + "'s balance: " + bank.checkBalance());
	}
}
public class BankingSystemTest {
	public static void main(String[] args) {
		Customer cust = new Customer("Abhishek");

		Bank sib = new SBI();
		Bank hdfc = new HDFC();
		Bank icici = new ICICI();

		cust.deposit(sib, 1000);
		cust.withdraw(sib, 500);
		cust.checkBalance(sib);

		System.out.println();
		cust.deposit(hdfc, 5000);
		cust.withdraw(hdfc, 1230);
		cust.checkBalance(hdfc);

		System.out.println();
		cust.deposit(icici, 100000);
		cust.withdraw(icici, 1203);
		cust.checkBalance(icici);
	}

}
