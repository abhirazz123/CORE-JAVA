package DEC_17;

interface Course
{
	 default String courseName() {
		 return " java Full stack ";
	 }
	 default String facultyName() {
		return "Ravi sir";
	}
	default String duration() {
		return "6 month";
	}
}
//@FunctionalInterface
interface NIT extends Course
{
	String nit(String courseName);
}
public class FunctionalInterface3
{
	public static void main(String[] args) {
		NIT n = cours-> "Welcome to "+ cours +"Course!!";
		System.err.println(n.nit(" java "));
		System.out.println("Course: "+n.courseName());
		System.out.println("faculty Name: "+n.facultyName());
		System.out.println("duration: "+ n.duration());
		
		
	}
}
