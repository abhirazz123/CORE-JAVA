package JAN_02;

public class ExceptionHandling12 {
	public static void main(String[] args) {
		try {
			try {
				try {
					int arr[]= {5,7,89,7,54,22,35,144,587,4,25,33,698,541,2,44,5,74,4};
					System.out.println(arr[35]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic Exception");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception");
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
