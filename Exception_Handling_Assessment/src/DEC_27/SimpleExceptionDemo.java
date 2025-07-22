package DEC_27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompting the user for two integers
            System.out.print("Enter first integer (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter second integer (b): ");
            int b = scanner.nextInt();

            // Display the entered values
            System.out.println("You entered: a = " + a + ", b = " + b);

        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException");

            // a. getMessage()
            System.out.println("getMessage(): " + e.getMessage());

            // b. toString()
            System.out.println("toString(): " + e.toString());

            // c. printStackTrace()
            System.out.println("printStackTrace(): ");
            e.printStackTrace();

        } finally {
            scanner.close();
            System.out.println("Scanner closed. Program ends.");
        }
    }
}
