package DEC_27;

public class IllegalStateExceptionDemo {

    static void throwIllegalException() {
        try {
            // Manually throwing an IllegalStateException
            throw new IllegalStateException("MyException");
        } catch (IllegalStateException objA) {
            // Handling the exception and printing it
            System.out.println("Caught: " + objA);
        }
    }

    public static void main(String[] args) {
        // Calling the method from main
        throwIllegalException();
    }
}
