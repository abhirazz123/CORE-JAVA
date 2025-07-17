package DEC_19;

import java.util.Random;
import java.util.function.Supplier;

public class RandomValueGenerator {
	public static void main(String[] args) {
		Random rendom = new Random();
		Supplier<String> stringSupplier = ()->{
			int number = 100 +rendom.nextInt(9000);
			return "NIT"+number;
		};
		System.out.println("Generated random string: "+stringSupplier.get());
		
		int min = 10;
		int max = 99;
		Supplier<Integer> integerSupplier = ()-> rendom.nextInt(max-min-1)+min;
		System.out.println("Generated random Inter :"+integerSupplier.get());
	}
}
