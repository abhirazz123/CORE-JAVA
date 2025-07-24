package JAN_02;

import java.io.IOException;

class NIT {
	static void nit()throws IOException{
		throw new IOException("IOException");

	}
}
public class ExceptionHandling14 {
	public static void main(String[] args) {
		try {
			NIT.nit();
		} catch (IOException e) {
			System.out.println("Exception in catch");
		}
		System.out.println("Executed");
	}

}
