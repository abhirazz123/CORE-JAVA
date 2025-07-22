package DEC_27.custom_exception;

public class ExceptionPropagationWithUnchecked {
	public static void main(String[] args) {
		System.out.println("Main method Started...");
		try {
			m1();
		} catch (ArithmeticException e) {
			System.out.println("Handled in main");
		}
		System.out.println("Main method ended");
	}
	public static void m1() {
		System.out.println("M1 method started..");
		m2();
		System.out.println("m1 method ended..");
	}
	public static void m2() {
		throw new ArithmeticException();
	}
}
