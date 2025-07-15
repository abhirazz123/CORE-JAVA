package DEC_17;
interface NIT16{
	String nit(String name) ;
	
}
public class FunctionalInterface16 {
	public static void main(String[] args) {
		NIT16 N = (String name)-> "Welcome to"+name;
		System.out.println(N.nit(" Naresh It"));
	}

}
