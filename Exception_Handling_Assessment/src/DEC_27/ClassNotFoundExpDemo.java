package DEC_27;

public class ClassNotFoundExpDemo {
    Class<?> c;

    // Default constructor
    public ClassNotFoundExpDemo() {
        try {
            // Attempting to load a class that likely doesn't exist
            c = Class.forName("TestClass");
        } catch (ClassNotFoundException e) {
            // Handling the exception
            System.out.println("ClassNotFoundException caught:");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating object to invoke constructor
        new ClassNotFoundExpDemo();
    }
}
