package Dec_19.interface_member;

import java.util.Scanner;

class Payment{
	// Payment using cash
	public void MakePayment(double amount) {
		if(ValidateAmount(amount)) {
			System.out.println("Processing payment via Cash...");
			System.out.println("Amount Paid RS :" + amount);
			System.out.println("Payment Successful!");

		}

	}
	//Payment through creditCard
	public void makePayment(String CardHolderName, String CreditCardNumber,double amount) {
		if(ValidateCardnumber(CreditCardNumber)&& ValidateAmount(amount)) {
			System.out.println("Processing payment via Credit Card...");
			System.out.println("Card Holder: " + CardHolderName);
			System.out.println("Card Number: " + maskCardNumber(CreditCardNumber));
			System.out.println("Amount Paid RS :" + amount);
			System.out.println("Payment Successful!");

		}
	}
	//Payment through debitCard
	public void makePayment(String debitCardNumber,double amount) {
		if(ValidateCardnumber(debitCardNumber)&& ValidateAmount(amount)) {
			System.out.println("Processing payment via Debit Card...");
			System.out.println("Card Number: " + maskCardNumber(debitCardNumber));
			System.out.println("Amount Paid RS :" + amount);
			System.out.println("Payment Successful!");

		}
	}
	// Helper method to validate credit OR debit card
	private boolean ValidateCardnumber (String CardNumber) {
		if(CardNumber.length()!=16) {
			System.err.println("Error: Invalid card number. It must be 16 digits.");
			return false;
		}
		return true;
	}

	private String maskCardNumber(String cardNumber) {
		return "****-****-****-"+cardNumber.substring(12);

	}

	// Helper method to validate amount
	private boolean ValidateAmount(double amount) {
		if(amount<=0) {
			System.err.println("Error: Amount must be greater than zero.");
			return false;
		}
		return true;	
	}
}

public class PaymentProcess {
	public static void main(String[] args) {
		System.out.println("Payment Menu");
		System.out.println("Please select any one Payment Method from the Menu :");
		System.out.println("\t\t 1) Payment by using Cash ");
		System.out.println("\t\t 2) Payment by using Credit Card ");
		System.out.println("\t\t 3) Payment by using Debit Card ");

		Payment payment = new Payment();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your Payment choice [1/2/3]: ");
		int choice = sc.nextInt();

		switch(choice) {
		case 1:
			System.out.print("Enter the amount you want to pay through cash :");
			double amount = sc.nextDouble();
			payment.MakePayment(amount);
			break;

		case 2:
			System.out.print("Enter your name : ");
			String name = sc.next();
			System.out.print("Enter your 16 digit Credit Card Number :");
			String creditCard = sc.next();

			System.out.print("Enter your Payment Amount :");
			amount =sc.nextDouble();
			payment.makePayment(name, creditCard, amount);
			break;

		case 3:
			System.out.println("Enter your 16 digit Debit Card Number :");
			String debitCard = sc.nextLine();
			debitCard = sc.nextLine();
			System.out.println("Enter your Payment Amount :");
			amount = sc.nextDouble();
			payment.makePayment(debitCard, amount);
			break;
		}

		sc.close();

	}
}