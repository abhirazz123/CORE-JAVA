package OCt_28;
public class Employee2 {
	int employeeNumber;
	String	employeeName;
	double employeeSalary;

	public  Employee2(int employeeNumber, String employeeName, double employeeSalary) {
		if(employeeNumber <0) {
			this.employeeNumber = 0;
			System.out.println("employeeNumber must be a positive integer");

		}else {
			this.employeeNumber = employeeNumber;
		}
		if(employeeSalary<0) {
			this.employeeSalary = 0;
			System.out.println("Salary cannot be negative");
		}
		else {
			this.employeeSalary = employeeSalary;
		}
		if(employeeName == "null") {
			this.employeeName = "null";
			System.out.println("Name must be initialized with a default value");
		}
		else {
			this.employeeName = employeeName;
		}
	}
	public void Employee2Detlish() {
		System.out.println("Employee Number: "+ employeeNumber);
		System.out.println("Employee Name: "+ employeeName);
		System.out.println("Employee Salary: "+ employeeSalary);
	}
	public static void main(String[] args) {
		Employee2 emp2 = new Employee2(1007, "Abhishek kumar", 150000);
		if(emp2.employeeSalary>=60000) {
			System.out.println("Employee is a Developer");
		}else if(emp2.employeeSalary>=40000 && emp2.employeeSalary<=60000) {
			System.out.println("Employee is a Designer");
		}else {
			System.out.println("Employee is a Tester");

		}
		emp2.Employee2Detlish();
	}
}
