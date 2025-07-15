package DEC_17;

import java.util.function.Function;

public class FunctionalInterface5 {
	public static void main(String[] args) {
		Function<String , Boolean> fun = str->str.startsWith("A");
		System.out.println(fun.apply("Abhishek"));
	}
}
