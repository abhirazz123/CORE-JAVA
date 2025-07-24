package JAN_02;

public class ExceptionHandling {
	static void nit(int marks) {
		if(marks <0 || marks>50) {
			throw new IllegalArgumentException(Integer.toString(marks));
		}
	}
	public static void main(String[] args) {
		nit(55);
	}

}
