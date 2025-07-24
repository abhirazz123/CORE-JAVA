package JAN_02;

public class ExceptionHandling17 {
	public static void main(String[] args) {
		try {
			Exception artarithmetic = new Exception();
			artarithmetic.initCause(new ArithmeticException("Arithmetic Exception"));
			throw artarithmetic;
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		try {
			NumberFormatException  NumberFormat = new NumberFormatException("NumberFormatException");
			NumberFormat.initCause(new NullPointerException("NullPointerException"));
            throw NumberFormat;

			
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
	}
}
