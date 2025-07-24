package DEC_31;

import java.util.Scanner;

public class TransactionApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FinancialTransaction  ft = new FinancialTransaction();
		try {
			System.out.print("Enter Transaction amount: ");
			String amountInput = sc.nextLine();
			double amount = Double.parseDouble(amountInput);
			
			System.out.print("Enter account number: ");
			String accountinput = sc.nextLine();
			long account = Long.parseLong(accountinput);
			ft.processTransaction(amount, account);
			
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());

		}
	}

}
