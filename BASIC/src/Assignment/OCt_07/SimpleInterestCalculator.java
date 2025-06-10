package Assignment.OCt_07;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (R) in percentage: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (T) in years: ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        double totalAmount = principal + simpleInterest;

        System.out.printf("Simple Interest: Rs. %.2f%n", simpleInterest);
        System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);

        scanner.close();
    }
}
