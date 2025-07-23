package DEC_30;

public class ClassCastExceptionDemo {

    // Static method to handle ClassCastException
    public static void handleClassCastException() {
        // Test cases: You can switch between these arrays for different test cases

        // Test Case 1: All Strings (Successful Casting)
        // Object[] objects = {"Hello", "World", "Java"};

        // Test Case 2: One Integer (Unsuccessful Casting)
        // Object[] objects = {"Hello", 123, "Java"};

        // Test Case 3: One Boolean (Unsuccessful Casting)
        Object[] objects = {"Hello", true, "Java"};

        // Iterate and try to cast each object to String
        for (Object obj : objects) {
            try {
                String str = (String) obj;
                System.out.println("Casting successful: " + str);
            } catch (ClassCastException e) {
                System.out.println("ClassCastException: Cannot cast " + obj.getClass().getName() + " to String.");
                e.printStackTrace();
            }
        }
    }

       public static void main(String[] args) {
        handleClassCastException();
    }
}
