package OCT_28.Encapsulation_Setter_and_Getter;
import java.util.*;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Student iD: ");
		int StudentId =sc.nextInt();

		System.out.println("Enter the Student Name: ");
		String StudentName = sc.next();
		sc.nextLine();

		System.out.println("Enter the Student Marks: ");
		int StudentMark = sc.nextInt();


		System.out.println("Enter the Student Addresh:");
		String StudentAdd = sc.next();
		sc.nextLine();

		Student Abhi = new Student(StudentId, StudentName, StudentMark,StudentAdd);
		System.out.println(Abhi);
		int marks = Abhi.getStudentMark();

		if(marks>=90) {
			System.out.println(Abhi.getStudentName()+"is Excellent in Subject");
		}
		else if(marks>=75) {
			System.out.println(Abhi.getStudentName()+" is Very godd in   Subject");
		}else {
			System.out.println(Abhi.getStudentName()+" is godd in subject");
		}

	}

}
