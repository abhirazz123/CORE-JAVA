package DEC_18;

import java.util.function.Predicate;

public class FunctionalInterfaceExample14 {
	public static void main(String[] args) {
		Predicate< Integer> grater = a->a>15;
		Predicate<Integer>lass = a->a<10;
		
		boolean bool = grater.test(20);
		boolean bool1 = lass.test(5);
		System.out.println(bool);
		System.out.println(bool1);
	}

}
