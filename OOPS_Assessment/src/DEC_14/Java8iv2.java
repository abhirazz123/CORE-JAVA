package DEC_14;

import java.util.function.Consumer;

public class Java8iv2 {
	public static void main(String[] args) {
		Consumer< String> value = (a)->System.out.println(a.toLowerCase());
		value.accept("NreshIT");
	}
}
