package DEC_31;

import java.util.Scanner;

class FinancialTransaction {
    public void processTransaction(double amount, long accountNumber) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Transaction amount must be positive.");
            }

            // Simulating success
            System.out.println("Processing transaction...");
            System.out.println("Transaction successful: Amount Rs." + amount + " transferred to account " + accountNumber);

        } catch (RuntimeException e) {
            System.out.println("Error processing transaction: " + e.getMessage());
        }
    }
}
