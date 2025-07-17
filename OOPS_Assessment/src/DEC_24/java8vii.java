package DEC_24;

@FunctionalInterface
interface NIT26 {
 String myInterface(String a);
}


@FunctionalInterface
interface Calculate {
 int myinterface(int a, int b);
}

public class java8vii {

 private void operation(int a, int b, Calculate cal) {
     System.out.println(cal.myinterface(a, b));
 }

 public static void main(String[] args) {
     java8vii java = new java8vii();


     Calculate cal = (a, b) -> a + b;
     java.operation(1, 5, cal); // Output: 6

    
     cal = (a, b) -> a * b;
     
     NIT26 nit = a -> a;
     System.out.println(nit.myInterface("NIT")); // Output: NIT
 }
}
