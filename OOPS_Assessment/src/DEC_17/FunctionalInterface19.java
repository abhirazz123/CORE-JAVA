package DEC_17;

interface NIT19{
	String nit(String name);
}
public class FunctionalInterface19 implements NIT19 {
	public static void main(String[] args) {
		FunctionalInterface19 nit = new FunctionalInterface19();
		System.out.println(nit.nit("Welcome To "));	
	}
	@Override
	public String nit(String name) {
		return name +"Naresh It";
	}

}
