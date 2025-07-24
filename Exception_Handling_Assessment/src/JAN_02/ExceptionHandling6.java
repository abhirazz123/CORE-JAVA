package JAN_02;
class Age2 extends Exception{
	public Age2(String str) {
		super(str);
	} 
}
public class ExceptionHandling6 {
	static void nit(int age) throws Age2 {
		if(age<18) {
			throw new Age2("Not for Vote");
		}else {
			System.out.println("Vote");
		}
	}
	public static void main(String[] args) {
		try {
			nit(19);
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}finally {
			System.out.println("Vote count ");
		}
	}
}
