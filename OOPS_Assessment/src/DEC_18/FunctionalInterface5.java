package DEC_18;
import java.util.function.Function;

public class FunctionalInterface5 {
    public static void main(String[] args) {
        // λ that maps a String → Integer (result of compareTo)
        Function<String, Integer> compareToGoogle = s -> s.compareTo("google");

        System.out.println(compareToGoogle.apply("Apple"));   // prints a negative number
        System.out.println(compareToGoogle.apply("google"));  // prints 0
        System.out.println(compareToGoogle.apply("zebra"));   // prints a positive number
    }
}

