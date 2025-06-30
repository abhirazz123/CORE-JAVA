package DEC_06;
abstract class Student{
	protected String studentName ;
	protected String studentClass ;
	protected static int totalNoOfStudents =0 ;
	public Student() {
		System.out.println("no-argument constructor ");
	}


	public Student(String studentName, String studentClass) {
		this.studentName = studentName;
		this.studentClass =  studentClass;
		this.totalNoOfStudents ++;
	}

	public abstract int getPercentage() ;
	public static int getTotalNoStudents() {
		return totalNoOfStudents;

	}
}
class ScienceStudent extends Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;


	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(studentName, studentClass);

		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;

	}
	@Override
	public int getPercentage() {

		return (physicsMarks + chemistryMarks + mathsMarks)/3;
	}
}
class HistoryStudent extends Student{
		private int historyMarks;
		private int civicsMarks;


	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	public int getPercentage() {
		
		return (historyMarks+ civicsMarks)/2;
	}
	
}
public class StudentTester {
	public static void main(String[] args) {
		ScienceStudent s1 = new ScienceStudent("Abhishek Kumar", "12th", 81, 96, 75);
		 HistoryStudent h1 = new HistoryStudent("Bob", "12B", 75, 85);

	        System.out.println("Science Student Percentage: " + s1.getPercentage() + "%");
	        System.out.println("History Student Percentage: " + h1.getPercentage() + "%");
	        System.out.println("Total Number of Students: "+ Student.totalNoOfStudents);
	}

}
