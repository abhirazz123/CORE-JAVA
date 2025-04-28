package OCT_24.variable_copy_demo;

public class static_Variable 
{
	static int x =100; //static field
	public static void main(String []args) {
		static_Variable s1 = new static_Variable();
		static_Variable s2 = new static_Variable();
		
		++s1.x;
		//System.out.println(s1.x);//101
		++s2.x;
		System.out.println(s1.x);//102
		System.out.println(s2.x);//102
	}
	
}
