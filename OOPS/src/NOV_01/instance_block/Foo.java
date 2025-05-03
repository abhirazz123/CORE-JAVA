package NOV_01.instance_block;

public class Foo 
{
	Foo(){
		System.out.println("No Argument Constructor");
	}
	Foo(int x){
		System.out.println("Parameterized Constructor");
	}
	{
		System.out.println("NSB");
	}
	public static void main(String[] args) {
		new Foo();
		new Foo(10);
	}

}
