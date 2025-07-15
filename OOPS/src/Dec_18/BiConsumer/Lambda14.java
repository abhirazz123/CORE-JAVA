package Dec_18.BiConsumer;

import java.util.function.BiFunction;

public class Lambda14 {
	public static void main(String[] args) {
		
		// BiFunction to concatenate two strings
		BiFunction<String, String, String> concatenateSting =(str1,str2)->str1+str2;;
		String result = concatenateSting.apply("Hello ", "JAVA");
		System.out.println(result);
		
	      // BiFunction to find the length two strings
		BiFunction<String , String, Integer> concatenateLength = (str1,str2)->str1.length()+str2.length();
		Integer result2 = concatenateLength.apply("Hello", "JAVA");
		System.out.println(result2);
		
	}
}
