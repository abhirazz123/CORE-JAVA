package Dec_11.Loose_oupling;
class Alpha{
	static {
		System.out.println("Static block of Alpha class");
	}
	public static final int A = 100;
}

public class CompileTimeConstant {
	public static void main(String[] args) {
		System.out.println(Alpha.A);
	}

}
