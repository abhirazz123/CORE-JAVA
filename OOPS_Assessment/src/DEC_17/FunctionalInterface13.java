package DEC_17;
interface NIt13{
	public  int myInterface(int a);
}

public class FunctionalInterface13 {
	public static void main(String[] args) {
		NIt13 nit = (a)->a+1;
		System.out.println(nit.myInterface(5));
	}

}
