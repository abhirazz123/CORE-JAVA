package Dec_13.lambda;
@FunctionalInterface
interface Printable{
	public void print();
}

public class LambdaDemo2 {
	public static void main(String[] arg) {
		Printable p = ()-> System.out.print("p");
		p.print();
	}

}
