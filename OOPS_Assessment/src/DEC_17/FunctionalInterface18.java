package DEC_17;
interface NIT18{
	String nit(String name);
}

public class FunctionalInterface18 {
	public static void main(String[] args) {
		NIT18 nit = (String name )-> "Welcome to "+ name;
		System.out.println(nit.nit("Naresht IT"));
	}

}
