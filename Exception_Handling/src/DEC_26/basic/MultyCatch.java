package DEC_26.basic;

public class MultyCatch {
	public static void main(String[] args) {
		 System.out.println("Main Started...");
		 try {
			int c = 10/2;
			System.out.println("c value is: "+ c);
			int []x = {12,78,56};
			System.out.println(x[4]);
			 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array is not of limit....");
		}
		 catch (ArithmeticException e) {
			System.out.println("Divide by zero proble.....");
		}
		 catch (Exception e) {
			System.out.println("General");
		}
		 System.out.println("Main Ended...");
	}
}
