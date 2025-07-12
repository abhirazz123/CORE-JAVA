package DEC_06;
class Check{
	public void accept(int[] x, float[] y) {
		System.out.println(x[0]+":"+y[1]);
	}
}
public class Test15 {
	public static void main(String[] args) {
		Check c = new  Check();
		c.accept(new int[] {12,13}, new float[] {12.50f,67.56f});
	}

}
