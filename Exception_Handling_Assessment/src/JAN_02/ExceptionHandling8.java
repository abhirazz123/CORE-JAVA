package JAN_02;
class Student2{
	void message() throws Exception {//line 1
		System.out.println("Hai Student");
	}
}
class Faculty2 extends Student2{
	void message()throws Exception { // line 2
		System.out.println("hai Faculty2");
	}
}

public class ExceptionHandling8 {
	public static void main(String[] args) {
		Student2 nit = new Faculty2();
		try {
			nit.message();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
