package NOV_21;

public class Example19 {
    static {
        int x = 10;                  // This is a local variable, NOT the class variable.
        Example19.x = x + x;         // Sets class variable x = 10 + 10 = 20
    }

    static int x;                    // Declares and implicitly initializes x = 0 (by default for `int`)

    public static void main(String[] args) {
        System.out.println("Class Level X : " + Example19.x);
    }

    static {
        x = x + Example19.x;         // x = 20 + 20 = 40
    }
}
