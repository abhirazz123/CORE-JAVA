package NOV_20_method_area;
class Employee{}

class Student{}

class Sample{}

public class ClassLoadingInformation {
	public static void main(String[] args) {
		Class cls = Employee.class;
		System.out.println(cls.getName());//FQN (Package name + class name)
		
		cls = Student.class;
		System.out.println(cls.getName());
		
		cls = Sample.class;
		System.out.println(cls.getName());
	}

}
