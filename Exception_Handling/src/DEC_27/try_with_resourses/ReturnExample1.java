package DEC_27.try_with_resourses;

public class ReturnExample1 {
	public static void main(String[] args) {
		System.out.println(m1());
		
	}
	@SuppressWarnings("finally")
	public static int m1() {
		try {
			System.out.println("inside try");
			return 100;
		} catch (Exception e) {
			System.out.println("inside of catch");
			return 200;
		}
		finally {
			System.out.println("inside of finally");
			return 300;
		}
		// System.out.println("....");   Unreachable line
	}
}
