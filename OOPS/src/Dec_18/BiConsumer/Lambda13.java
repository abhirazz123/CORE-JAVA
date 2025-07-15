package Dec_18.BiConsumer;

import java.util.function.BiConsumer;

public class Lambda13 {
	public static void main(String[] args) {
		BiConsumer<Integer, String> updateVarible = (num , str)->{

			num = num*2;
			str = str.toUpperCase();
			System.out.println("Update Values: "+num+" , "+str);

		};
		int number = 15;
		String text ="nit";
		updateVarible.accept(number, text);

		// Values after the update (note that the original values are unchanged)
		System.out.println("Original values: "+number+", "+text);
	}
}
