package Dec_11.inheritance;
interface Alpha{
	void m1();
}
interface Beta{
	void m1();
}
class Implementer  implements Alpha,Beta{
	@Override
	public void m1() {
		System.out.println("MI is possible");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Implementer i = new Implementer();
		i.m1();
	}
}
