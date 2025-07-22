package DEC_26.Exception_and_Messages;

import java.util.Scanner;

public class SimpleExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the first integer (a): ");
			int first = sc.nextInt();
			System.out.print("Enter the second integer (b): ");
			int second = sc.nextInt();
			System.out.println("You entered a = "+first + " and b = "+second);
		} catch (Exception e) {
			System.out.println("An InputMismatchException occurred.");
			System.out.println("Message "+e.getMessage());
			System.out.println("String representation"+e.toString());
			System.out.println("Stack trace: ");
			e.printStackTrace();
		}
	}

}
