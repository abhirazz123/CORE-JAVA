package DEC_14;

//@FunctionalInterface
interface NIT {
	String get(String nit);
}

public class FunctionalInterface7 {
	public static void main(String[] args) {
		NIT nit = (str) -> str + "Welcome to";    // Lambda that adds "Welcome to"
		NIT nit1 = (str) -> str + "NARESHIT";      // Lambda that adds "NARESHIT"

		information(" Hai ", nit);   // Output: Hai Welcome to
		information(" Hai ", nit1);  // Output: Hai NARESHIT
	}

	public static void information(String str, NIT obj) {
		String result = obj.get(str);
		System.out.println(result);
	}
}
