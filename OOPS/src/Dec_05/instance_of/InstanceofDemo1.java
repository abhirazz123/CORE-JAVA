package Dec_05.instance_of;
class Test{	
}
public class InstanceofDemo1 {
	public static void main(String[] args) {
		Test t = new Test();
		if(t instanceof Test) {
			System.out.println("t1 is pointing to test object");
		}
	}
}
