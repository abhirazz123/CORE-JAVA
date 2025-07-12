package DEC_05;
class Account {
	String 	accountNumber ;
	double 	balance ;

	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	public Account generateStatement() {

		System.out.println("Account Statement:");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: Rs. " + balance);
		return this;

	}
}
class SavingsAccount extends Account{
	double 	interestRate ;
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;


	}
	@Override
	public SavingsAccount generateStatement() {
		 System.out.println("Savings Account Statement:");
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: Rs. " + balance);
	        System.out.println("Interest Rate: " + interestRate + "%");
	        return this;

	}

}
class CheckingAccount  extends Account{
	double overdraftLimit ;
	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
@Override
public CheckingAccount generateStatement() {
	 System.out.println("Savings Account Statement:");
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: Rs. " + balance);
     System.out.println("overdraft Limit: " + overdraftLimit);
     return this;

}
}
public class BankManagementSystem {
	public static void main(String[] args) {
		 SavingsAccount savings = new SavingsAccount("SA12345", 50000.0, 4.5);
	        savings.generateStatement();

	        System.out.println();

	        CheckingAccount checking = new CheckingAccount("CA54321", 20000.0, 10000.0);
	        checking.generateStatement();
	}

}
