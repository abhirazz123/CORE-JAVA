package Assignment.OCt_07;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the net bill amount (in Rs): ");
        double netBill = scanner.nextDouble();

        double discountPercent;

        if (netBill < 5000) {
            discountPercent = 5;
        } else if (netBill >= 5000 && netBill < 10000) {
            discountPercent = 10;
        } else {
            discountPercent = 15;
        }

        double discountAmount = netBill * (discountPercent / 100);
        double amountPayable = netBill - discountAmount;

        System.out.printf("Discount Percentage: %.2f%%%n", discountPercent);
        System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Amount Payable: Rs. %.2f%n", amountPayable);

        scanner.close();
    }
}
