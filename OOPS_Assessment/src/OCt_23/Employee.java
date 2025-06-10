package OCt_23;

import java.util.Scanner;

public class Employee {
	private String FirstName;
	private String LastName;
	private int EmployeeId;
	private double Salary;
	private int NoOfproject;

	public void setEmployeeData(String FirstName, String LastName, int EmployeeId, double Salary, int NoOfproject) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.EmployeeId = EmployeeId ;
		this.Salary = Salary ;
		this.NoOfproject = NoOfproject;
	}
	private void calculateSalary() {
		if(NoOfproject >=5 &&NoOfproject <=10) {
			Salary += 5000;
		}
		else if (NoOfproject>10 && NoOfproject<20){
			Salary += 10000;
		}else if(NoOfproject >20) {
			Salary +=15000;
		}

	}
	public void displayDetails() {
		System.out.println("First name: "+FirstName);
		System.out.println("List Name : "+LastName);
		System.out.println("Employe Id : "+EmployeeId);
		System.out.println("Salary: "+Salary);
		System.out.println("No Of project: "+NoOfproject);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Name : ");
		String FirstName = sc.nextLine();
		
		System.out.print("Enter the Lirst Name : ");
		String LastName = sc.nextLine();
		
		System.out.print("Enter the Employee Id : ");
		int EmployeeId = sc.nextInt();
		
		
		System.out.print("Enter the Employee Salary : ");
		double Salary = sc.nextDouble();
		
		System.out.print("Enter the no of project : ");
		int NoOfproject = sc.nextInt();
		
		Employee emp = new Employee();
		emp.setEmployeeData(FirstName, LastName, EmployeeId, Salary, NoOfproject);
		
		emp.calculateSalary();
		emp.displayDetails();
		
	}

}
