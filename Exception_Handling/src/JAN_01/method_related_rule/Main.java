package JAN_01.method_related_rule;

public class Main {
	{
		try{
			throw new ArithmeticException();
		}
		catch (ArithmeticException e){
			 System.out.println("Normal Termination");
		}
	}
	
	public static void main(String[] args) {	
	  new Main();
	  System.out.println("Main");
	}
}