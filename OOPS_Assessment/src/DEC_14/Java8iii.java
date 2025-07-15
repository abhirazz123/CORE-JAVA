package DEC_14;

import java.util.function.Consumer;

public class Java8iii {
	public static void main(String[] args) {
		Consumer< Integer> value = (a)-> System.out.println(a*3);
		value.accept(5);
	}
}
