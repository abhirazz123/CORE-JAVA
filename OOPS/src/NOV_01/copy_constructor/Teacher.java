package NOV_01.copy_constructor;

public class Teacher {
	private int TeacherId;
	private String TeacherName;
	
	public Teacher(Student stu) {
		this.TeacherId = stu.getStudentId();
		this.TeacherName = stu.getStudentName();
	}

	@Override
	public String toString() {
		return "Teacher [TeacherId=" + TeacherId + ", TeacherName=" + TeacherName + "]";
	}

}
