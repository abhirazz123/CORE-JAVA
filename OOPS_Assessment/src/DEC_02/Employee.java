package DEC_02;

public class Employee {
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;

	public Employee(int id,String name, double basicSalary, double HRAPer, double DAPer) {
		if(basicSalary<0 && HRAPer<0 && DAPer<0) {
			 System.out.println("Error: Salary components must be non-negative.");
		}
		this.id = id;
		this.name = name ;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
	}
	public double calculateGrossSalary() {
		return basicSalary+ HRAPer+ DAPer;

	}

}
