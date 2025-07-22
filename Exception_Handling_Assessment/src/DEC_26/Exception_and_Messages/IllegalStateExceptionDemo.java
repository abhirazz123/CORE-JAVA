package DEC_26.Exception_and_Messages;

public class IllegalStateExceptionDemo {

    static void throwIllegalException() {
        try {
            throw new IllegalStateException("MyException");
        } catch (IllegalStateException objA) {
            System.out.println("Caught: " + objA);
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling throwIllegalException from main method:");
        throwIllegalException();
    }
}
