package NOV_29;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test Case 1: Add two doubles
        double num1 = 10.5;
        double num2 = 20.3;
        double sumDouble = calc.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " (double): " + sumDouble);

        // Test Case 2: Multiply two integers
        int int1 = 10;
        int int2 = 20;
        int productInt = calc.multiply(int1, int2);
        System.out.println("Product of " + int1 + " and " + int2 + " (int): " + productInt);

        // Test Case 3: Add with a negative integer
        int neg1 = -10;
        int pos1 = 20;
        int sumNegative = calc.add(neg1, pos1);
        System.out.println("Sum of " + neg1 + " and " + pos1 + " (int): " + sumNegative);
    }
}
