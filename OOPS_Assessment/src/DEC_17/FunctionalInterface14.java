package DEC_17;
interface NIT14{
	int cal(int value);
	
}
public class FunctionalInterface14 {
	public static void main(String[] args) {
		NIT14 nit = (int value)-> value +15;
		System.out.println("Result:"+nit.cal(250));
	}

}
