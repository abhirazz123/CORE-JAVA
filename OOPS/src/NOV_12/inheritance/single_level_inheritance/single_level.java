package NOV_12.inheritance.single_level_inheritance;

class Father{
	public void house() {
		System.out.println("2 BHK house");
	}
}
class Son extends Father {
	public void car() {
		System.out.println("Audi Car");
	}
}
public class single_level {
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.car();
		s1.house();
	}

}
