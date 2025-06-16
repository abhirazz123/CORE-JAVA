package NOV_21;

public class Test51 {
 //   int x = 10; 
	static int  x = 10;

    public static void main(String[] args) { 
        System.out.println(x);  // ❌ Error: Cannot make a static reference to the non-static field x
    } 

    static { 
        System.out.print(x + " "); // ❌ Error: Cannot make a static reference to the non-static field x
    } 
}
