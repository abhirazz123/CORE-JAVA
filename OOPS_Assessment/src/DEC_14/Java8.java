package DEC_14;
interface NIT17{
	public int myInterface(int a);
}
public class Java8 {
	public static void main(String[] args) {
		NIT17 nit = (a)->a+1;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}
