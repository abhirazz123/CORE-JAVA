package DEC_30;

import java.util.Scanner;

public class DivisionExample {
	public static int performDivision (int dividend ,int divisor) {
		if (dividend == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return dividend/ divisor;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the dividend: ");
			int dividend = sc.nextInt();
			System.out.print("Enter the divisor: ");
			int divisor = sc.nextInt();
			int result = performDivision(dividend, divisor);
			System.out.println("Result of division: "+result);

		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException caught: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Some other exception occurred: " + e.getMessage());
		} finally {
			sc.close();
			System.out.println("Scanner closed. Program ended.");
		}
	}
}

