package DEC_17;
interface NIT4{
	String nit(String Coursename );
}
interface Course4 extends NIT4{
	String courseName();
	String facultyName();
	String duration();

}
public class FunctionalInterface4 {
	
	public static void main(String[] args) {
		NIT4 N = (String course)->course;
		System.out.println(N.nit("java"));
	}
}
