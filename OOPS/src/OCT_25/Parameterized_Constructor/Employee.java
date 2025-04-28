package OCT_25.Parameterized_Constructor;

public class Employee {
	int id;
	 String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void getEmployee() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee Name: "+name);
	}
	public static void main(String[] args) {
		Employee emp = new Employee(1007,"Abhi" );
		emp.getEmployee();


	}

}
