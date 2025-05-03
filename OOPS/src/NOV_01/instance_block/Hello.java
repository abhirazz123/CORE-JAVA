package NOV_01.instance_block;

public class Hello 
{
	public Hello() 
	{
		System.out.println("Constructor");
		{
			System.out.println("NSB2");
		}
	}
	
	{
		System.out.println("NSB1");
	}
	public static void main(String[] args) {
		new Hello();
	}

}
