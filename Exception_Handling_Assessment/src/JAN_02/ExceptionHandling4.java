package JAN_02;
class Age extends Exception{
	Age(String str){
		super(str);
	}
}

public class ExceptionHandling4 {
	static void nit(int age) throws Age {
		if(age<18) {
			throw new Age("Note for Vote");
		}else {
			System.out.println("Vote");
		}
	}
	public static void main(String[] args) {
		try {
			nit(15);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
