package OCt_23;
import java.util.Scanner;

public class Student {
	private int StudentId;
	private String StudentName;
	private int Marks;
	private char grade;
	
	public void setStudentData(int StudentId, String StudentName, int Marks) {
		this.StudentId = StudentId;
		this.StudentName = StudentName ;
		this.Marks = Marks;
		calculateGrade();
		
	}
	public void calculateGrade() {
		if(Marks>90) {
			grade = 'A';
		}
		else if(Marks>80) {
			grade = 'B';
		}else if(Marks >70) {
			grade = 'C';
		}
		else if(Marks> 60) {
			grade = 'C';
			
		}else {
			grade = 'E';
		}
		
	}
	public void displayDetails() {
		System.out.println("Student Id : "+StudentId);
		System.out.println("Student Name : "+StudentName);
		System.out.println("Student Marks : "+Marks);
		System.out.println("Student Grade : " +grade);
	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudentData(1007, "Abhishek", 91);
		stu.calculateGrade();
		stu.displayDetails();	
	}

}
