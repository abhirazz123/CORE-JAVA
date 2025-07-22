package DEC_27.basic;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Main method started....");
		try {
			System.out.println(10/0);
		} finally  {
			System.out.println("Finally Block");
		}
		System.out.println("Method");
	}
}
