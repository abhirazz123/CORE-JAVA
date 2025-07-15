package DEC_18;
interface NIT17{
	int myInterface(int a);
}
interface newInterface{
	void alpha(String s);
}
public class Java8ii {
	public static void main(String[] args) {
		NIT17 nit = (a)->a*a*a;
		System.out.println(nit.myInterface(5));
		
		newInterface result =(a)->System.out.println("Welcome to NareshIT");
		System.out.println("");
	}
}
