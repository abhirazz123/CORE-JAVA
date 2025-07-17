package DEC_23;

import java.util.function.Consumer;

interface ObjectCreator{
	Object create(int id, String name);
}
class Student {
	private int id;
	private String name ;
	 
	Student(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	void updateName (Consumer<Student> updateName1) {
		updateName1.accept(this);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public void setName(String Newname) {
		this.name = Newname;
	}
	public String getName() {
		return this.name;
	}
	
}
public class Main {
    public static void main(String[] args) {

        ObjectCreator creator = (id, name) -> new Student(id, name);

        // --- Test Case 1 ---
        Student student1 = (Student) creator.create(1, "John Doe");
        Consumer<Student> updateName1 = s -> s.setName("Jane Updated");
        student1.updateName(updateName1);
        System.out.println("Updated Student Details:");
        System.out.println(student1);

        // --- Test Case 2 ---
        Student student2 = (Student) creator.create(2, "Alice");
        Consumer<Student> updateName2 = s -> s.setName(s.getName() + " Johnson");
        student2.updateName(updateName2);
        System.out.println("\nUpdated Student Details:");
        System.out.println(student2);

        // --- Test Case 3 ---
        Student student3 = (Student) creator.create(3, "Bob");
        Consumer<Student> noUpdate = s -> { /* do nothing */ };
        student3.updateName(noUpdate);
        System.out.println("\nUpdated Student Details:");
        System.out.println(student3);
    }
}