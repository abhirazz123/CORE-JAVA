package JAN_02;
class Student5 {
	void message() throws Exception{
		System.out.println("Hai Student");
	}
}
class Faculty5 extends Student5{
	void message() {
		System.out.println("Hai faclty");
	}
}

public class ExceptionHandling11 {
	public static void main(String[] args) {
		Student5 std = new Student5();
		try {
			std.message();
		} catch (Exception e) {

		}
	}
}
