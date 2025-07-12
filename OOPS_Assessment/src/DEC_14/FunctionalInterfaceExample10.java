package DEC_14;
import java.util.function.Function;

public class FunctionalInterfaceExample10 {
	public static void main(String[] args) {
		Function<String, String> fun = str->str.substring(2,5);
		System.out.println(fun.apply("Hyderabad"));
	}

}
