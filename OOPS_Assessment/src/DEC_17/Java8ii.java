package DEC_17;
interface NIT11{
	public void muInterface(int a);
}
public class Java8ii {
	public static void main(String[] args) {
		NIT11 nit =(a)-> System.out.println(a+1);
		nit.muInterface(8);
	}
}
