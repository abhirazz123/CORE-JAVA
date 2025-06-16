package NOV_18;

// Abstract Bank class
abstract class Bank {
	protected String bankName;
	protected String branchName;
	public static String ifscCode = "IFSC1234";

	public Bank(String bankName, String branchName) {
		this.bankName = bankName;
		this.branchName = branchName;
	}

	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	public abstract boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount);
	public abstract double loan(double amount, int years);
}

class Axis extends Bank {
	private double interestRate;

	public Axis(String bankName, String branchName, double interestRate) {
		super(bankName, branchName);
		this.interestRate = interestRate;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) System.out.println("Withdrawal of " + amount + " from Axis Bank successful.");
		else System.out.println("Invalid withdrawal amount.");
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) System.out.println("Deposit of " + amount + " to Axis Bank successful.");
		else System.out.println("Invalid deposit amount.");
	}

	@Override
	public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {
		if (amount > 0 && fromAccount.getBalance() >= amount) {
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);
			System.out.println("Transfer successful.");
			return true;
		}
		System.out.println("Transfer failed.");
		return false;
	}

	@Override
	public double loan(double amount, int years) {
		if (amount > 0) {
			double total = amount + (amount * interestRate * years / 100);
			System.out.println("Loan approved. Total payable: " + total);
			return total;
		}
		System.out.println("Invalid loan amount.");
		return 0;
	}
}

class ICICI extends Bank {
	private double loanLimit;

	public ICICI(String bankName, String branchName, double loanLimit) {
		super(bankName, branchName);
		this.loanLimit = loanLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) System.out.println("Withdrawal of " + amount + " from ICICI Bank successful.");
		else System.out.println("Invalid withdrawal amount.");
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) System.out.println("Deposit of " + amount + " to ICICI Bank successful.");
		else System.out.println("Invalid deposit amount.");
	}

	@Override
	public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {
		if (amount > 0 && fromAccount.getBalance() >= amount) {
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);
			System.out.println("Transfer successful.");
			return true;
		}
		System.out.println("Transfer failed.");
		return false;
	}

	@Override
	public double loan(double amount, int years) {
		if (amount > 0 && amount <= loanLimit) {
			System.out.println("Loan approved for: " + amount);
			return amount;
		}
		System.out.println("Loan denied.");
		return 0;
	}
}

class SBI extends Bank {
	private double minimumBalance;

	public SBI(String bankName, String branchName, double minimumBalance) {
		super(bankName, branchName);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) System.out.println("Withdrawal of " + amount + " from SBI Bank successful.");
		else System.out.println("Invalid withdrawal amount.");
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) System.out.println("Deposit of " + amount + " to SBI Bank successful.");
		else System.out.println("Invalid deposit amount.");
	}

	@Override
	public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {
		if (amount > 0 && (fromAccount.getBalance() - amount) >= minimumBalance) {
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);
			System.out.println("Transfer successful.");
			return true;
		}
		System.out.println("Transfer failed due to insufficient balance.");
		return false;
	}

	@Override
	public double loan(double amount, int years) {
		if (amount > 0) {
			System.out.println("Loan approved.");
			return amount;
		}
		System.out.println("Invalid loan amount.");
		return 0;
	}
}

class BankAccount {
	private static int accountCounter = 1000;
	private int accountNumber;
	private double balance;
	private Bank bank;

	public BankAccount(Bank bank, double initialDeposit) {
		this.accountNumber = accountCounter++;
		this.balance = initialDeposit;
		this.bank = bank;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		bank.withdraw(amount);
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		}
	}

	public void deposit(double amount) {
		bank.deposit(amount);
		if (amount > 0) {
			balance += amount;
		}
	}

	public void transfer(double amount, BankAccount toAccount) {
		bank.transfer(amount, this, toAccount);
	}

	public double checkBalance() {
		return balance;
	}
}

class ATM {
	public static void withdraw(BankAccount account, double amount) {
		System.out.println("ATM withdrawal of " + amount);
		account.withdraw(amount);
	}

	public static void deposit(BankAccount account, double amount) {
		System.out.println("ATM deposit of " + amount);
		account.deposit(amount);
	}

	public static boolean transfer(BankAccount from, BankAccount to, double amount) {
		System.out.println("ATM transfer of " + amount);
		from.transfer(amount, to);
		return true;
	}
}

class Customer {
	private int customerId;
	private String name, address, phoneNumber;
	private BankAccount bankAccount;

	public Customer(int customerId, String name, String address, String phoneNumber) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public void openAccount(Bank bank, double initialDeposit) {
		this.bankAccount = new BankAccount(bank, initialDeposit);
		System.out.println("Account opened with initial deposit of " + initialDeposit);
	}

	public void closeAccount() {
		this.bankAccount = null;
		System.out.println("Account closed successfully.");
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public double checkBalance() {
		return bankAccount != null ? bankAccount.getBalance() : 0;
	}
}

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer(1, "Abhishek", "Delhi", "9999999999");
		Bank axisBank = new Axis("Axis", "MG Road", 5.0);
		cust.openAccount(axisBank, 1000);

		BankAccount acc = cust.getBankAccount();
		acc.deposit(500);
		acc.withdraw(200);
		acc.checkBalance();
		acc.transfer(300, new BankAccount(axisBank, 0));

		ATM.withdraw(acc, 100);
		ATM.deposit(acc, 200);
		ATM.transfer(acc, new BankAccount(axisBank, 100), 50);

		axisBank.loan(10000, 2);
		System.out.println("Final balance: " + acc.checkBalance());
	}
}
