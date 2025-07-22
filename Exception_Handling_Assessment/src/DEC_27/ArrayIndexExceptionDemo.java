package DEC_27;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int a[] = new int[2];  // Creating an integer array of size 2

        try {
            // Trying to access an invalid index (index 3 does not exist)
            System.out.println("Accessing a[3]: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Exception caught: Array index is out of bounds.");
            
            // Additional exception details (optional)
            System.out.println("toString(): " + e.toString());
            System.out.println("getMessage(): " + e.getMessage());
            System.out.print("printStackTrace(): ");
            e.printStackTrace();
        }
    }
}
