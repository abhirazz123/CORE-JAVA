package Dec_18.supplier;

import java.util.function.Supplier;

class Employee{
	private Integer EmployeeID;
	private String EmployeeName;
	private Double EmployeeSalary;

	public Employee(Integer EmployeeID, String EmployeeName, Double EmployeeSalary) {
		this.EmployeeID = EmployeeID;
		this.EmployeeName = EmployeeName;
		this.EmployeeSalary = EmployeeSalary;

	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + "]";
	}

}

public class SupplierDemo2 {
	public static void main(String[] args) {
		Supplier<Employee> s2 = ()-> new Employee(1007, "Abhishek", 50000.0);
		System.out.println(s2.get());
	}

}
