package DEC_26.Exception_and_Messages;

public class ArrayIndexOutOfBoundExceptionDemo {
	public static void main(String[] args) {
		int a []= new int [2];
		
		try {
			System.out.println(a[3]); 
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An ArrayIndexOutOfBoundsException occurred.");
			System.out.println("Message: "+e.getMessage());
			System.out.println("String representation: "+e.toString());
			System.out.println("Stack trace: ");
			e.printStackTrace();
			
		}
	}

}
