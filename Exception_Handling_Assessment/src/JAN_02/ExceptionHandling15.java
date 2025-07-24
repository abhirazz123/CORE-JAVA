package JAN_02;

import java.io.IOException;

class NIT2{
	static void nit() throws IOException {
		throw new IOException();
	}
}
public class ExceptionHandling15 {
	public static void main(String[] args) throws IOException {
		NIT2.nit();
	}

}
