package DEC_27.basic;

public class FinallyWithCatch {
	public static void main(String[] args) {
		try {
			int [] x = new int [-2];
			x [1] = 12;
			x[2] = 15;
			System.out.println(x[0]+":"+x[1]);
		} catch (Exception e) {
			System.err.println("Array is in nagtive value...");
		}
		finally {
			System.out.println("Resources will be handled here!!!");
		}	
	}
}
