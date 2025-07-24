package JAN_02;
class age extends Exception{
	
}
public class ExceptionHandling5 {
	public static void main(String[] args) {
		try {
			throw new age();
		} catch (age e) {
			System.out.println("Exception "+e.getMessage());
		}
	}
}
