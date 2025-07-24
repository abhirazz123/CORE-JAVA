package JAN_02;
class Student4{
	void message() {
		System.out.println("Hai Student");
		
	}
}
class Faculty4 extends Student4{
	void message() {
		System.out.println("Hai Faculty4");
	}
}
public class ExceptionHandling10 {
	public static void main(String[] args) {
		Student4 nit = new Faculty4();
		try {
			nit.message();
		} catch (Exception e) {
			
		}
	}

}
