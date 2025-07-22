package DEC_27;

public class ExceptionExample2 {
	public static void main(String[] args) {
		try {
			int [] num = {1,2,3};
			System.out.println(num[3]);
		} catch (Exception e) {
			System.err.println("ArrayIndexOutOfBoundsException occurred");
		}finally {
			System.out.println("End of Program");
		}
	}
}
