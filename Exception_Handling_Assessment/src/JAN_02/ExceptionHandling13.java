package JAN_02;

import java.io.IOException;

public class ExceptionHandling13 {
	void nit() throws IOException {
		throw new java.io.IOException();//error
	}
	public static void main(String[] args) throws IOException {
		ExceptionHandling13 exp = new ExceptionHandling13();
		exp.nit();
		System.out.println("Executed");
		
	}

}
