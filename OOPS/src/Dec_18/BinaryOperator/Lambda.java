package Dec_18.BinaryOperator;

import java.util.function.BinaryOperator;

public class Lambda {
	public static void main(String[] args) {
		BinaryOperator<Integer>Add = (a,b)->a+b;
		System.out.println(Add.apply(2, 5));
	}
}
