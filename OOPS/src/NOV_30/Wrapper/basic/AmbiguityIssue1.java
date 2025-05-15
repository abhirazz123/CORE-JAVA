package NOV_30.Wrapper.basic;
class Test1{
	public void acpt(int d) {
		System.out.println("int");
	}
	public void acpt(char d) {
		System.out.println("char");
	}
}
public class AmbiguityIssue1 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.acpt(6);
	}

}
