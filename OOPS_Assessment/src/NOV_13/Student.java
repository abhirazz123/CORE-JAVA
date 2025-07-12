package NOV_13;

public class Student {
	protected  String name;
	protected  int rollNumber;

	public  Student(String name, int rollNumber) {
		if(name == null) {
			System.out.println("Unknown");
		}else {
			this.name = name;
		}

		this.rollNumber = rollNumber ;
	}
	public void displayDetails(){
		System.out.println("Name: "+ name);
		System.out.println("Roll Number "+ rollNumber);

	}

	public double calculatePercentage() {
		return 0.0;

	}
}
class SceinceStudent extends Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks ;
	public SceinceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		if(physicsMarks<0 && chemistryMarks <0 && mathMarks<0) {
			System.out.println("Error Invalid Input");
		}else {
			 this.physicsMarks = physicsMarks;
			 this.chemistryMarks = chemistryMarks;
			 this.mathMarks = mathMarks;
		}

	}
	@Override
	public void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Roll Number "+ rollNumber);
		System.out.println("Physics Marks: "+ physicsMarks);
		System.out.println("Chemistry Marks: "+chemistryMarks);
		System.out.println("Math Marks: "+mathMarks);
		 System.out.println("Percentage: " + calculatePercentage() + "%");
	}
	@Override
	public double calculatePercentage() {
		return (physicsMarks+chemistryMarks+mathMarks)/3.0;

	}
}
class ArtsStudent extends Student{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;

	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		if(historyMarks<0 && geographyMarks<0 & englishMarks<0) {
			System.out.println("Error Invalid Input");
		}else {
			this.historyMarks = historyMarks;
			this.geographyMarks = geographyMarks;
			this.englishMarks = englishMarks;
		}


	}

	@Override
	public double calculatePercentage() {

		return (historyMarks+ geographyMarks+englishMarks)/3.0;

	}
	@Override
	public void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Roll Number: "+ rollNumber);
		System.out.println("History Marks: "+ historyMarks);
		System.out.println("Geography Marks: "+ geographyMarks);
		System.out.println("English Marks: "+ englishMarks);
		 System.out.println("Percentage: " + calculatePercentage() + "%");

	}

}
