package OCT_28.method_return_type;

public class Demo {
	private int id ;
	public Demo(int id) {
		this.id = id;
	}
	public Demo get() {
		return new Demo(5);
	}

}
