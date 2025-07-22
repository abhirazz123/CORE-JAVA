package DEC_26.Exception_and_Messages;

import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void handleExceptions(String input) {
        try {
            // This may throw NullPointerException
            int length = input.length();
            System.out.println("Length of the input string: " + length);

            // This may throw NumberFormatException
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input, not a number.");
            e.printStackTrace(); // For detailed error output
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Attempted to operate on a null object.");
            e.printStackTrace(); // For detailed error output
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to convert to an integer: ");
        String userInput = sc.nextLine();

        // Convert "null" string input to actual null reference
        if ("null".equalsIgnoreCase(userInput.trim())) {
            userInput = null;
        }

        handleExceptions(userInput);
        sc.close();
    }
}
