package DEC_14;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface Str{
	int methodstr(String str) ;
}

public class FunctionalInterface4 {
    public static void main(String[] args) {
    	Str str = (String s)-> Integer.parseInt(s);
    	System.out.println(str.methodstr("2"));
       
    }
}
