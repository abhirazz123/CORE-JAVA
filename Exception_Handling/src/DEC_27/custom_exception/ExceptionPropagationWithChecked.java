package DEC_27.custom_exception;

public class ExceptionPropagationWithChecked {
	public static void main(String[] args) {
		System.out.println("Main method Started");
		try {
			m1();
			
		} catch (ClassNotFoundException  e) {
			System.out.println("Handled by main method");
		}
		System.out.println("Main method ended");
	}
	public static void m1() throws ClassNotFoundException {
		System.out.println("M1 method started!!!");
		m2();
		System.out.println("M1 method ended");
	}
	public static void m2() throws ClassNotFoundException {
		System.out.println("m2 method Body!!");
		Class.forName("Simple");
	}
}
