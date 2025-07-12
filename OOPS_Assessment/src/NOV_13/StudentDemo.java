package NOV_13;

public class StudentDemo {
	public static void main(String[] args) {
		SceinceStudent sci = new SceinceStudent("Abhi", 1007, 90, 85, 86);
		sci.displayDetails();
		sci.calculatePercentage();
		System.out.println();

		ArtsStudent arts = new  ArtsStudent("Abhishek", 102, 75, 80, 80);
		arts.displayDetails();
		sci.calculatePercentage();
	}

}
