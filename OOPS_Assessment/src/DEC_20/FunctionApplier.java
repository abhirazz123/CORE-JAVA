package DEC_20;

import java.util.function.Function;

public class FunctionApplier {

    // Static method that applies a function to the value
    public static int applyFunction(int value, Function<Integer, Integer> function) {
        return function.apply(value);
    }

    public static void main(String[] args) {
        int sampleValue = 10;
        System.out.println("Original value = " + sampleValue);

        // Function to add 5
        Function<Integer, Integer> add = a -> a + 5;

        // Function to multiply by 2
        Function<Integer, Integer> multiply = m -> m * 2;

        // Function to subtract 3
        Function<Integer, Integer> subtract = s -> s - 3;

        // Use applyFunction method instead of direct apply()
        System.out.println("After adding 5: " + applyFunction(sampleValue, add));
        System.out.println("After multiplying by 2: " + applyFunction(sampleValue, multiply));
        System.out.println("After subtracting 3: " + applyFunction(sampleValue, subtract));
    }
}
