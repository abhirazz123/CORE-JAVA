package DEC_14;
import java.lang.FunctionalInterface;
@FunctionalInterface
interface NIT18{
	int myInterface(int a);
}
@FunctionalInterface
interface NewInterface{
	void alpha(String a);
	
}
public class Java8ii {
	public static void main(String[] args) {
		NIT18 nit = (a)->a*a*a;
		System.out.println(nit.myInterface(6));
		
		NewInterface result = (a)->System.out.println("Welcome to Naresh IT");
		result.alpha("");
	}

}
