package NOV_26.association;

public class Student {
	private int studentId;
	private String studentName;
	private int studentMarks;

	public Student(int studentId, String studentName, int studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public void SetstudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getstudentId() {
		return studentId;

	}
	public void SetstudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getstudentName() {
		return studentName;

	}
	public void SetstudentMark(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	public int getstudentMark() {
		return studentId;

	}

	public String toString() {
		return "Student [ StudentId = "+studentId +"Student Name: "+studentName+ " Student Marks: "+studentMarks+"]";

	}

}
