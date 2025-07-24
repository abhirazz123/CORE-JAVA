package DEC_31;

public class FinancialTransaction {
    public void processTransaction(double amount, long accountNumber) {
        System.out.println("Processing transaction...");
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Transaction amount must be positive.");
            }

            // You could add more account number validation logic here if needed
            System.out.printf("Transaction successful: Amount Rs.%.1f transferred to account %d%n", amount, accountNumber);

        } catch (IllegalArgumentException  e) {
            System.out.println("Error processing transaction: " + e.getMessage());
        }
    }
}
