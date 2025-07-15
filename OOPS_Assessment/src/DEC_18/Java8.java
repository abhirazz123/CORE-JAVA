package DEC_18;
interface NIT16 {
	public int myIntderface(int a);
}
public class Java8 {
	public static void main(String[] args) {
		NIT16 nit = (a)->a+1;
		int i = nit.myIntderface(6);
		System.out.println(i);
	}
}
