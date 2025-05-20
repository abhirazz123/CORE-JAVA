package Dec_04.Overriding;
class Alpha
{
	
}
class Beta extends Alpha
{
	
}
class Super8 {
	public Alpha m1() {
		System.out.println("Super class Method");
		return  new Alpha();
	}
}
class Sub8 extends Super8
{
	@Override
	public Beta m1() {
		System.out.println("Sub class Method");
		return new Beta();
	}
}

public class OverridingDemo8 {

	public static void main(String[] args) {
		
		Super8 s1 = new Sub8();
		s1.m1();
		
		
	}

}
