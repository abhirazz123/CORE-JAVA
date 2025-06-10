package OCt_28;

public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;

	public  Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	public void calculateSalary(double Amount) {
		if(noOfProject >5 && noOfProject<10) {
			salary += 5000;
		}
		else if(noOfProject >10 && noOfProject <20) {
			salary += 1000;
		}
		else if(noOfProject>20) {
			salary += 15000;
		}
		else {
			System.out.println("Number of projects cannot be negative and do not update salary");
		}
	}
	public void EmployeeDetlish() {
		System.out.println("first Name: "+ firstName);
		System.out.println("List Name: "+ lastName);
		System.out.println("Employee Id: "+employeeId);
		System.out.println("salary: "+ salary);
		System.out.println("no Of Project : "+ noOfProject);

	}
	public static void main(String[] args) {
		Employee emp = new Employee("Abhishek", "Kumar", 1007, 50000, 7);
		emp.calculateSalary(15000);
		emp.EmployeeDetlish();
	}
}
