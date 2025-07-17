package DEC_19;

import java.util.function.Consumer;

public class ValueModifier {
    public static void main(String[] args) {
        // Sample values – you can change these to test different inputs
        String sampleString = "hello";
        Integer sampleInteger = 3;

        // Print original values
        System.out.println("Original string: " + sampleString);
        System.out.println("Original integer: " + sampleInteger);

        // Consumer to convert string to uppercase
        Consumer<String> stringConsumer = s -> 
            System.out.println("After converting string to uppercase: " + s.toUpperCase());

        // Consumer to square the integer
        Consumer<Integer> integerConsumer = i -> 
            System.out.println("After squaring the integer: " + (i * i));

        // Apply consumers
        stringConsumer.accept(sampleString);
        integerConsumer.accept(sampleInteger);
    }
}