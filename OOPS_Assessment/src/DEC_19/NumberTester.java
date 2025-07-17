package DEC_19;
import java.util.function.Predicate;

public class NumberTester {

    // Method to test a number against a predicate
    public static boolean testPredicate(int number, Predicate<Integer> predicate) {
        return predicate.test(number);
    }

    public static void main(String[] args) {
        int number = 13; // Change this number to test other inputs

        // Predicate to check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Predicate to check if a number is prime
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // Test and print results
        System.out.println("Is " + number + " even? " + testPredicate(number, isEven));
        System.out.println("Is " + number + " prime? " + testPredicate(number, isPrime));
    }
}
