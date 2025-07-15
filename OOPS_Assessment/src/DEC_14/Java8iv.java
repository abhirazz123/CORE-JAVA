package DEC_14;

import java.util.function.Consumer;

public class Java8iv {
	public static void main(String[] args) {
		Consumer<String> value = (a)->System.out.println("Naresh I Technologies");
		value.accept("");
	}
}
