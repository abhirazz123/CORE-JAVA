package JAN_02;
class Student {
	void message() throws ArithmeticException, Exception {// line 1
		System.out.println("Hai Student");
	}
}
class Faculty extends Student{
	void message() throws Exception {// line 2
		System.out.println("hai faculty");
	}
}

public class ExceptionHandling7 {
	public static void main(String[] args) {
		Student nit = new Student();
		try {
			nit.message();
		} catch (Exception e) {
			
		}
	}

}
