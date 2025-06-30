package DEC_11;

import java.util.Scanner;

interface AdvancedArithmetic {
    public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator calc = new MyCalculator();

        System.out.print("Enter a positive integer: ");
        String input = sc.nextLine();

        try {
            int num = Integer.parseInt(input);

            if (num <= 0) {
                System.out.println("Error: Input must be a positive integer.");
            } else {
                int result = calc.divisorSum(num);
                System.out.println("Sum of divisors: " + result);
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid positive integer.");
        }

        sc.close();
    }
}
