package DEC_18;
interface Str{
	int methodstr(String str);
}

public class FunctionalInterface4 {
	public static void main(String[] args) {
		//Str str = (String s)->"2"; error
		Str str = a->Integer.parseInt("2");
		System.out.println(str.methodstr("2"));
	}

}
