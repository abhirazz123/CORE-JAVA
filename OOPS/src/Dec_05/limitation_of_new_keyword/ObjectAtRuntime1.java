package Dec_05.limitation_of_new_keyword;
class Student1{
	public void greet() {
		System.out.println("Welcome Student");
	}
}
class Simple {
	public void greet() {
		System.out.println("Hello Betch39!!!");
	}
}
public class ObjectAtRuntime1 {
	public static void main(String[] args) throws Exception{
		Object obj = Class.forName(args[0]).newInstance();
		if(obj instanceof Simple) {
			Simple s1 = (Simple) obj;
			s1.greet();
		}
		else if(obj instanceof Student1) {
			Student1 s1 = (Student1) obj;
			s1.greet();
		}
	}
}
