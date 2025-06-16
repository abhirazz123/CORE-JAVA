package NOV_21;

public class JVMArc2 {
	public static void main(String[] args) {
		System.out.println(JVMArc.class.getClassLoader());
		System.out.println(JVMArc.class.getClassLoader().getParent());
		System.out.println(JVMArc.class.getClassLoader().getParent().getParent());
		
	}
}
