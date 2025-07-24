package JAN_02;

public class ExceptionHandling18 {
	static void nit() throws ArithmeticException{
		System.out.println("Nit1");
		throw new ArithmeticException("Throws Arithmetic Exception");
	}
	static void nit2() throws NullPointerException{
		throw new NullPointerException("thors NullPointer Exception nit2");
	}
	public static void main(String[] args) {
		try {
			nit2();
		} catch (NullPointerException npe) {
			System.out.println(npe);
		}
		try {
			nit();
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
	}
}
