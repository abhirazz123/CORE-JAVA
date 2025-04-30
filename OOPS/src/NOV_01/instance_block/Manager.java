package NOV_01.instance_block;

public class Manager {
	int x = 10;
	{
		System.out.println("Instance Initializer");
		//return ;
	}
	public static void main(String[] args) {
		//TOD Auto-genertad method sub
		new Manager();
	}
}
