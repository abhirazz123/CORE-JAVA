package DEC_18;
interface NIT7{
	int Square(int x);
	default int add(int a, int b) {
		return a+b;
	
	}
	default int sub(int a, int b) {
		return a-b;
	}
	default int multiply(int a, int b) {
		return a*b;
	}
	default int divide(int a , int b) {
		return a/b;
	}
}

public class FunctionalInterface7 implements NIT7 {
	public static void main(String[] args) {
		int a = 25;
		int b = 5;
		FunctionalInterface7 fun = new FunctionalInterface7();
		 int add = fun.add(a, b);
		 int sub = fun.sub(add, b);
		 int mul = fun.multiply(a, b);
		 int div = fun.divide(a, b);
		 
		 System.out.println(add+" "+sub+" "+mul+" "+div);		
	}
	public int Square(int x) {
		return x;
	}
}
