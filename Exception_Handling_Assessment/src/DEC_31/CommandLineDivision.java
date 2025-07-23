package DEC_31;

public class CommandLineDivision {
    public static void main(String[] args) {
        try {
            // Check for exactly two arguments
            if (args.length != 2) {
                throw new IllegalArgumentException("Two command-line arguments required.");
            }

            int dividend = 0;
            int divisor = 0;

            try {
                dividend = Integer.parseInt(args[0]);
                divisor = Integer.parseInt(args[1]);

                try {
                    double result = (double) dividend / divisor;
                    System.out.println("Division result: " + result);
                } catch (ArithmeticException ae) {
                    System.out.println("Arithmetic error: " + ae.getMessage());
                }

            } catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }

        } catch (IllegalArgumentException iae) {
            System.out.println("IllegalArgumentException: " + iae.getMessage());
        } finally {
            System.out.println("Division operation completed.");
        }
    }
}
