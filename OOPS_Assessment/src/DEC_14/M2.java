package DEC_14;
import java.lang.FunctionalInterface;


@FunctionalInterface
interface Printable {
    public void print();
}

public class M2 {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("print");
            }
        };

        p.print();  // call the method
    }
}
