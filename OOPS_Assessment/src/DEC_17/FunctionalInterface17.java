package DEC_17;

interface NIT17{
	String str(String str);
}

public class FunctionalInterface17 {
	public static void main(String[] args) {
		NIT17 nit = (String n) -> n +" Radhe Radhe ";
		System.out.println(nit.str("Jay sree ram"));
		
	}
}
