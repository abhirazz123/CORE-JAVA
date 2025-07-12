package DEC_14;
//@FunctionalInterface
interface NIT9{
	 int  square(int x) ;
	 static int add(int a, int b) {
		return a+b;
	 }
	 static int sub(int a,int b) {
		return a-b;
		 
	 }
	 static int multiply(int a, int b) {
		return a*b;
		 
	 }
	 static int divide (int a, int b) {
		 return a/b;
	 }
		
}
public class FunctionalInterfaceExample9 {
	public static void main(String[] args) {
		int a = 25;
		int b = 5;
		
		int add = NIT9.add(a, b);
		int sub = NIT9.sub(a, b);
		int mul = NIT9.multiply(a, b);
		int div = NIT9.divide(a, b);
		System.out.println(add+" "+sub+" "+mul+" "+div);
		
		NIT9 sq = (x)->{
			return x*x;
			
		};
		System.out.println(sq.square(6));
	}
}
