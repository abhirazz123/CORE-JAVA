package NOV_22.static_block;
class Alpha{
	static {
		System.out.println("Satatic Block of super class Alpha!!");
	}
}
class Beta extends Alpha{
	static {
		System.out.println("Static Block of Sub class Beta!!");
	}
}

public class InheritanceLoading {
	public static void main(String[] args) {
		new Beta();
	}

}
