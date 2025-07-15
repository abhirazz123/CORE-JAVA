package DEC_17;
interface NIT20{
	String nit(String name);
}
public class FunctionalInterface20 {
	public static void main(String[] args) {
		NIT20 nit = (String name)->{
			return name;
		};
		NIT20 nit1 = (String name)->name;
		System.out.println(nit.nit("Welcome to ")+nit1.nit("Naresh it"));
	}
}
