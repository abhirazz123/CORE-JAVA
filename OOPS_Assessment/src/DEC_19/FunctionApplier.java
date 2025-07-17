package DEC_19;

import java.util.function.Function;

public class FunctionApplier {
	public static void main(String[] args) {
		String testStringLength = "hello";
		int testdivideAndFormat = 10;
		Function<String, Integer> getStringLength = str->str.length();
		Function<Integer, Double> divideAndFormat = num->num/2.0;
		System.out.println("String length of "+testStringLength+": "+getStringLength.apply(testStringLength));
		System.out.println("Result of dividing "+testdivideAndFormat+" by 2: "+divideAndFormat.apply(testdivideAndFormat));
	}

}
