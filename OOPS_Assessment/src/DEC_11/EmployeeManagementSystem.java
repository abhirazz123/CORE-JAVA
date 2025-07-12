package DEC_11;

import java.util.Scanner;

interface Employee{
		public double calculateSalary() ;

		public void generatePayroll() ;

}
class FullTimeEmployee implements Employee{

		private int employeeId;
		private String employeeName;
		private double monthlySalary;
		private double benefits;

	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		  if (employeeName == null || employeeName.trim().isEmpty()) {
	            throw new IllegalArgumentException("Error: Employee name cannot be empty.");
	        }
	        if (monthlySalary < 0) {
	            throw new IllegalArgumentException("Error: Monthly salary cannot be negative.");
	        }
		this.employeeId = employeeId;
		this.employeeName = employeeName ;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}
	@Override
	public double calculateSalary() {
	double	totalSalary = monthlySalary + benefits;
		return totalSalary;
	}

	@Override
	public void generatePayroll() {
		System.out.println("Employee Id : " +employeeId);
		System.out.println("Employee Name : "+ employeeName);
		System.out.println("Monthly Salary : "+ monthlySalary);
		System.out.println("Benefits : "+ benefits);

	}

}
public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the Employee Id : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter the Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Monthly Salary : " );
		double salary = sc.nextDouble();

		System.out.print("Benefits: ");
		double benefits =sc.nextDouble();

		if(name.trim().isEmpty()) {
			 System.out.println("Error: Employee name cannot be empty.");
		}else if (salary<0){
			 System.out.println("Error: Monthly salary cannot be negative.");
		}else {
			FullTimeEmployee emp = new FullTimeEmployee(id, name, salary, benefits);
			System.out.println("\nPayroll Details:");
			emp.generatePayroll();
			System.out.println("Total Salary : "+emp.calculateSalary());
		}



	}

}
