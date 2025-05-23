package Dec_05.limitation_of_new_keyword;
class Student{
	
}
class Employee{
}

public class ObjectAtRuntime {

	public static void main(String[] args) throws  Exception  {
		Object obj = Class.forName(args[0]).newInstance();
		System.out.println("Object Created for : "+obj.getClass().getName());
	}
}
