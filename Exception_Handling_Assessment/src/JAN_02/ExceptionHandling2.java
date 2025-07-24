package JAN_02;
class InvalidPassword extends Exception{
	 InvalidPassword(String str ) {
		super(str);
	}
}
public class ExceptionHandling2 {
	  static void nit (String password)  throws InvalidPassword{
		if(password.length()<5) {
			System.out.println("Invalid Password");
		}else {
			System.out.println("valid Password");
		}
	}
	public static void main(String[] args) {
		try {
			nit("NareshIT");
		} catch (InvalidPassword e) {
			System.out.println("Exception "+e);
		}
		
	}
}
