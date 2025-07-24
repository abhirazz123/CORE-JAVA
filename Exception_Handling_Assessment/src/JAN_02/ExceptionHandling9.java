package JAN_02;
class Student3 {
	void message() {
		System.out.println("hain Student");
	}
}
class Faculty3 extends Student3{
	void message()throws ArithmeticException {
		System.out.println("hain Faculty3");
	}
}

public class ExceptionHandling9 {
	public static void main(String[] args) {
		Student3 nit = new Student3();
		try {
			nit.message();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
