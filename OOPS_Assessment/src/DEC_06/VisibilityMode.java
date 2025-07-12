package DEC_06;
class Super{
	public void show() {
		System.out.println("Show method of super class!!!");
	}
}
class Sub extends Super{
	@Override
	//protected void show()
	public void show()
	{
		System.out.println("Show method of sub class!!!!");
	}

}

public class VisibilityMode {
	public static void main(String[] args) {
		Super s = new Super();
		s.show();
	}

}
