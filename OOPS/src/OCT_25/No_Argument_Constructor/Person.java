package OCT_25.No_Argument_Constructor;

public class Person {
	private int personId;
	private String personName;
	
	public  Person() 
	{
		personId = 1007;
		personName = "Abhi";
	}
	@Override
	public String toString() {
		return "Person[ Person Id = " +personId +" Person name = " +personName+"]";
		
	}

}
