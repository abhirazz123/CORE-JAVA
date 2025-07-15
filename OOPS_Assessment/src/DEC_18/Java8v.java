package DEC_18;

import java.util.function.Consumer;

public class Java8v {
	public static void main(String[] args) {
		Consumer<String> value = (a)->System.out.println(a.toLowerCase());
		value.accept("NareshIT");
	}
}
