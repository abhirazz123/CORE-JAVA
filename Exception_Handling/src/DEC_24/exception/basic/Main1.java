package DEC_24.exception.basic;

public class Main1 {
	public static void main(String[] args) {
		try {
			throw new Error();
			
		} catch (Exception e) {
			System.out.println("Catch");
			System.out.println(e);
		}
	}
}
