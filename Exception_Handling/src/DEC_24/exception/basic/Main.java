package DEC_24.exception.basic;

public class Main {
	public static void main(String[] args) {
		try {
			//System.out.println(10/0);
			//OR
			throw new ArithmeticException("I am diving no by zero");


		} catch (Exception e) {
			System.out.println("inside Catch Block");
			System.out.println(e);
		}
	}
}
