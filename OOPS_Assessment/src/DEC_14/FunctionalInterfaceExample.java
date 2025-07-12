package DEC_14;
//@FunctionalInterface
interface NIT3{
	int square(int x);
	default int add(int a, int b ) {
		return a+b;
	}
	default int sub(int a , int b) {
		return a-b;
	}
	static int multiply(int a, int b) {
		return a*b;
	}
	static int divide(int a , int b) {
		return a/b;
	}

}

public class FunctionalInterfaceExample implements NIT3{
	public static void main(String[] args) {
		int a = 25;
		int b = 5;

		FunctionalInterfaceExample fun = new FunctionalInterfaceExample();
		int add = fun.add(a, b);
		int sub = fun.sub(a, b);
		int mul = NIT3.multiply(a,b);
		int div = NIT3.divide(a, b);
		System.out.println(add+" "+sub+" "+mul+" "+div);

	}
	public int square(int x) {
		return x*x;
	}
}
