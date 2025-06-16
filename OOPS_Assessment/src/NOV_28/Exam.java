package NOV_28;

public class Exam {
	int eid;
	String ename;
	String company;
	public String toString() {
		return "eid:" + eid + "\n" + "ename:" + ename + "\n" + "company:" + company + "\n";
	}
	public static void main(String[] args) {
		Exam e1 = new Exam();
		e1.eid = 7279;
		e1.ename = "Ganesh";
		e1.company = "Naresh IT";
		e1 = new Exam();
		System.out.println(e1.toString());
	}
}
