package DEC_17;
interface NIT8{
	public void nit();
}

public class FunctionalInterface8 {
	public static void main(String[] args) {
		String str = "IT";
		NIT8 n = ()-> {
			System.out.println("Naresh "+str);
		};
		n.nit();
	}
}
