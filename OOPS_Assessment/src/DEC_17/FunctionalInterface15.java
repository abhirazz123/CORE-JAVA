package DEC_17;
interface NIT15{
	void nit(String name);
}

public class FunctionalInterface15 {
	public static void main(String[] args) {
		NIT15 nit = (String name)->System.err.println(name);
		nit.nit("Abhishek");
		
	}

}
