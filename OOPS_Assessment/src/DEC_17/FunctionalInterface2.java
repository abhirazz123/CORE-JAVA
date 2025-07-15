package DEC_17;

public class FunctionalInterface2 {
	public static void main(String[] args) {
		Runnable nit = ()-> System.out.println("Thread Started");
		nit.run();
	}
}
