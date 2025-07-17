package DEC_23.exception;

public class ExceptionFormat {
	public static void main(String[] args) {
		ArithmeticException e1 = new ArithmeticException("Divided the number by zero");
		System.err.println(e1.toString());
	}
}
