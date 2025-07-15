package DEC_18;
interface NIT{
	String get(String nit);
}
public class FunctionalInterface6 {
	public static void main(String[] args) {
		NIT nit = (str)-> str+" Welcome to ";
		NIT nit1 = (str)-> str+" NARESHIT ";
		information("Hai", nit);
		information("Hai", nit1);
	}
	public static void information(String str , NIT obj) {
		String reslut = obj.get(str);
		System.out.println(reslut);
	}
}

