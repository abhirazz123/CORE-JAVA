package DEC_20;

import java.util.function.Consumer;

public class ValueModifier {
		public static void modifyValue(int value,Consumer<Integer>consumer) {
			consumer.accept(value);
		}
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Original value: "+num);
		
		Consumer< Integer> doubleValue = d->System.out.println("After doubling the value: "+num*2);
		doubleValue.accept(num);
		
		Consumer<Integer>incrementBy  = n->System.out.println("After incrementing the value by 3: "+(num+3));
		incrementBy.accept(num);
		
		Consumer<Integer> squareValue  = n->System.out.println("After squaring the value: "+num*num);
		squareValue.accept(num);
		
	}

}
