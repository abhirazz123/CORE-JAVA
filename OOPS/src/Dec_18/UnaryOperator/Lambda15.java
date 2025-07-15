package Dec_18.UnaryOperator;

import java.util.function.UnaryOperator;

public class Lambda15 {
	public static void main(String[] args) {
		UnaryOperator<Integer>Square = x->x*x;
		System.out.println(Square.apply(5));
		
		UnaryOperator<String> concat = str->str.concat("Base");
		System.out.println(concat.apply("Data"));
	}
}
