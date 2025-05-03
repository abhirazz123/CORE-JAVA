package NOV_13.No_Argument_Of_CurrentClass;
class Super {
	public Super() {
		 System.out.println("No argument constructor of Super class");
	}
	public Super(String str) {
		this();
		System.out.println("My Institute name is :"+str);
	}
}
class Sub extends Super{
	public Sub() {
		super("MGR");
		   System.out.println("No argument constructor of sub class");
	}
}

public class NoArgumentOfCurrentClass {
	public static void main(String[] args) {
		Sub s = new Sub();
	
	}

}
