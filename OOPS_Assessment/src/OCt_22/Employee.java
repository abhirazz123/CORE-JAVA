package OCt_22;

import java.util.Scanner;

public class Employee {
	int EmployeeId;
	String EmployeeName;
	double EmployeeSalary;

	public void setEmployeeData(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Employee Id: ");
		EmployeeId = sc.nextInt();
				sc.nextLine();

		System.out.print("Enter the Employee Name: ");
		EmployeeName = sc.nextLine();

		System.out.print("Enter the Employee Salary: ");
		EmployeeSalary = sc.nextDouble();
	}
	public void getEmployeeData() {
		System.out.println("Employee Id : "+EmployeeId);
		System.out.println("Employee Name : "+EmployeeName);
		System.out.println("Employee Salary : "+EmployeeSalary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployeeData();
		emp.getEmployeeData();
	}

}
