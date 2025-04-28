package OCT_23.Variable_Shadow;

public class Student 
{
	int id = 100;
	String name = "Abhi";
	public void accept() 
	{
		int id = 200;
		String name = "razz";
		System.out.println(id+":"+name);
	}
	public void input(int id, String name) 
	{
		System.out.println(id+":"+name);
		
	}
}
