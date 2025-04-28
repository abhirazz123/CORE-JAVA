package OCT_25.variable_copy_demo;

public class Student {
	int rollNumber;
	String studentName;
	String studentAddress;
	static String collegeName = "JNTU";
	static String courseName = "B.Tech";
	
	public void SetStudentData(int rollNumber, String studentName, String studentAddress) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + this.rollNumber + ", studentName=" + this.studentName + ", studentAddress="
				+ this.studentAddress +"college Name = "+Student.collegeName+ "course Name= "+Student.courseName+"]";
	}


}
