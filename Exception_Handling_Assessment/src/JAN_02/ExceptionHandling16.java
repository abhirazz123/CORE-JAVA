package JAN_02;

public class ExceptionHandling16 {
	static void nit(int a , int b) {
		int []arr = {25,54,22,141,22,141,22,35};
		System.out.println(b);
	}
	public static void main(String[] args) {
		try {
			nit(10,0);
			nit(10,15);
		} catch (ArithmeticException e) {
			System.out.println("Com't divid by zero");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds!!");
		}
	}

}
