package DEC_06;
class NIT9{
	static String val = " Welcome to nareshIT";
	String language;
	String faculty;
	String student;
	
	public NIT9(String faculty, String language, String student) {
		this.faculty = faculty;
		this.language = language;
		this.student = student;
	}
	public void get() {
		System.out.println(this.faculty+" "+this.language+" "+this.student);
	}
}
public class OopsTest9 {
	
	public static void main(String[] args) {
		NIT9 nit = new NIT9("java", "Naresh", "IT");
		nit.get(); 
	}

}
