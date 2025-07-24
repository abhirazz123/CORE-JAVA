package JAN_03;

import java.util.Scanner;

class InsufficientFundsException extends Exception{
	InsufficientFundsException(String message) {
		super(message);
	}
}
class InvalidAmountException extends Exception{
	InvalidAmountException(String message){
		super(message);
	}
}
class AccountNotFoundException extends Exception{
	AccountNotFoundException(String message){
		super(message);
	}
}
class LoanNotAllowedException extends Exception{
	LoanNotAllowedException(String message){
		super(message);

	}
}
interface Bank {
	void Deposits (double amount) throws InvalidAmountException ;
	void withdraw (double amount) throws InsufficientFundsException,InvalidAmountException;
	void transfer (BankAccount toaccount , double amount) throws InsufficientFundsException,InvalidAmountException,AccountNotFoundException;
	void applyForLoan(double amount) throws InsufficientFundsException,InvalidAmountException,AccountNotFoundException,LoanNotAllowedException;
	double getBalance ( );
}
class BankAccount implements Bank {
	private long accountNumber;
	private double balance;

	public BankAccount (long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public void Deposits(double amount) throws InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException(" Deposit amount must be greater than zero.");
		}
		balance +=amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if(amount<0) {
			throw new InsufficientFundsException("Withdrawal amount must be greater than zero.");
		}
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient  funds for withdrawal.");
		}
		balance -=amount;

	}

	@Override
	public void transfer(BankAccount toaccount, double amount)
			throws InsufficientFundsException, InvalidAmountException, AccountNotFoundException {
		if(amount<0) {
			throw new InsufficientFundsException("Transfer amount must be greater than zero.");
		}
		if(toaccount==null) {
			throw new AccountNotFoundException("Account Not Found ");
		}
		if(amount>balance) {
			throw new InvalidAmountException("Insufficient funds for transfer.");
		}
		this.balance -= amount;
		toaccount.Deposits(amount);

	}

	@Override
	public void applyForLoan(double amount) throws InsufficientFundsException, InvalidAmountException,
	AccountNotFoundException, LoanNotAllowedException {
		if(amount<0) {
			throw new LoanNotAllowedException("Loan amount must be greater than zero");
		}
		if(amount >50000 ||balance<500000) {
			throw new LoanNotAllowedException("Loan amount exceeds limit or balance is insufficient.");
		}
		balance += amount;
		System.out.println("Loan approved: Rs." + amount);

	}
	@Override
	public double  getBalance() {
		return balance;

	}

}
class Customer {
	private String name;
	private BankAccount account;

	Customer (String name, BankAccount account){
		this.name = name;
		this.account = account;
	}
	public BankAccount getAccount() {
		return account;

	}
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account1 = new BankAccount(101, 60000);
        BankAccount account2 = new BankAccount(102, 20000);
        Customer customer = new Customer("Abhishek", account1);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an option :");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Loan Application");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");

            int option = sc.nextInt();
            try {
                switch (option) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depAmt = sc.nextDouble();
                        customer.getAccount().Deposits(depAmt);
                        System.out.println("Deposit successful. New balance: Rs." + customer.getAccount().getBalance());
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withAmt = sc.nextDouble();
                        customer.getAccount().withdraw(withAmt);
                        System.out.println("Withdrawal successful. New balance: Rs." + customer.getAccount().getBalance());
                        break;
                    case 3:
                        System.out.print("Enter transfer amount: ");
                        double transAmt = sc.nextDouble();
                        customer.getAccount().transfer(account2, transAmt);
                        System.out.println("Transfer successful. New balance: Rs." + customer.getAccount().getBalance());
                        break;
                    case 4:
                        System.out.print("Enter loan amount: ");
                        double loanAmt = sc.nextDouble();
                        customer.getAccount().applyForLoan(loanAmt);
                        System.out.println("New balance after loan: Rs." + customer.getAccount().getBalance());
                        break;
                    case 5:
                        System.out.println("Current balance: Rs." + customer.getAccount().getBalance());
                        break;
                    case 6:
                        exit = true;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException | LoanNotAllowedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
