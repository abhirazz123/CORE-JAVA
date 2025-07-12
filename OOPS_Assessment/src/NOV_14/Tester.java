package NOV_14;

class Student{
	int studentId ;
	String studentName;
	double examFee ;

	public Student(int studentId, String studentName, double examFee) {
		if(examFee<=0||studentId<=0) {
			System.out.println("Error Invalid Input");
		}else {
			this.studentId = studentId;
			this.studentName = studentName;
			this.examFee = examFee ;

		}
	}
	public String displayDetails() {
		return"studen [ "+ " student Id " + studentId + " student Name "+ studentName+ " exam Fee "+ examFee;

	}
	public double payFee(double amount) {
		return examFee-amount;

	}

}
class DayScholar  extends Student{
	double transportFee;
	public DayScholar(int studentId, String studentName, double examFee, double transportFee) {
		super(studentId, studentName, examFee);
		this.transportFee = transportFee;

	}
	@Override
	public String displayDetails() {
		return"studen [ "+ "Id " + studentId + "Name "+ studentName+ "Fee "+ examFee +" transport Fee "+transportFee+"]";

	}
	@Override
	public double payFee(double amount) {
		return  (examFee+transportFee)-amount;
	}

}
class Hosteller extends Student{
private	double hostelFee;
	public Hosteller(int studentId, String studentName, double examFee, double hostelFee) {
		super(studentId, studentName, examFee);
		if(hostelFee<=0) {
			System.out.println("Error Invalid Input");
		}else {
			this.hostelFee = hostelFee;
		}

	}
	@Override
	public String displayDetails() {
		return"studen [ "+ "student Id" + studentId + "student Name "+ studentName+ "exam Fee "+ examFee+"hostel Fee "+ hostelFee+"]";

	}
	@Override
	public double payFee(double amount) {
		return (examFee + hostelFee)-amount;
	}

}
public class Tester {
	public static void main(String[] args) {

		System.out.println("--- Regular Student ---");
		Student s1 = new Student(1007, " Abhi ", 25000.0);
        System.out.println(s1.displayDetails());
        System.out.println("Remaining Balance: " + s1.payFee(25000.0));
        System.out.println();


        System.out.println("---Day Scholar----");
        DayScholar d1 = new DayScholar(1007, "Brian Lara", 25000.0, 5000.0);
        System.out.println(d1.displayDetails());
        System.out.println("Remaining Balance: " + d1.payFee(37000.0));
        System.out.println();

        System.out.println("---Hosteller---");
        Hosteller H1 = new Hosteller(3, "Virat Kohli", 25000.0, 8000.0);
        System.out.println(H1.displayDetails());
        System.out.println("Remaining Balance: " + H1.payFee(33000.0));
        System.out.println();
	}

}
