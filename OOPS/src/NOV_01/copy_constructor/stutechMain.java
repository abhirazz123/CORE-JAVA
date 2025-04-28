package NOV_01.copy_constructor;

public class stutechMain {
	public static void main(String[] args) {
		
		Student stu = new Student(1007, "Abhi", "MGR", "CSE");
		Teacher tech = new Teacher(stu);
		
		System.out.println(stu);
		System.out.println(tech);
	}

}
