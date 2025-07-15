package DEC_17;

import java.util.function.Supplier;

class Student{
	private int id;
	private String Name;
	private String gender;
	private int age;
	
	public Student(int id, String Name, String gender, int age) {
		this.id = id;
		this.Name = Name;
		this.gender = gender;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}

public class FunctionalInterface12 {
	public static void main(String[] args) {
		Supplier<Student> std = ()-> new Student(1007 , "Abhishek", "Male", 24);
		System.out.println(std.get());
		
	}

}
