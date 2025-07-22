package JAN_01.equals;
class Employee extends Object{
	private int EmployeeId;
	private String EmployeeName;
	
	public Employee(int EmployeeId, String EmployeeName) {
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		
	}
}

public class EqualsDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1007, "Abhishek kumar"); //1000x
		Employee e2 = new Employee(107,"Abhishek kumar") ;  //2000x
		   System.out.println(e1==e2); //false
		   System.out.println(e1.equals(e2)); //false [== operator]

	}

}
