package NOV_13HWWC_INITIALIZE_THE_OBJECT_PROPERTIES;

public class No_5_By_using_super_keyword {
	int x, y;
	public No_5_By_using_super_keyword(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

}
class Sub extends No_5_By_using_super_keyword{

	 Sub() {
		super(100, 200);
		
	}
	public static void main(String[] args) {
		Sub s = new Sub();
	}
	
}