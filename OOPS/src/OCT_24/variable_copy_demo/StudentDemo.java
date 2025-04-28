package OCT_24.variable_copy_demo;

public class StudentDemo {
	public static void main(String[] args) {
		Student raj = new Student();
		raj.SatStudentData(101, "Raj", "Ameerpet");
		
		Student priya = new Student();
		priya.SatStudentData(102, "Priya", "S R Nagar");
		
		Student scott = new Student();
		scott.SatStudentData(103, "Scott", "Koti");
		
		System.out.println(raj);
		System.out.println(priya);
		System.out.println(scott);

	}

}
