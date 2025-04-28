package OCT_25.Setter_and_Getter;

public class Employee1 {
	private double employeeSalary;
	
	public Employee1(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee1 [employeeSalary=" + employeeSalary + "]";
	}
	
	public static void main(String[] args) {
		Employee1 emp = new Employee1(100007);
		System.out.println(emp);
		System.out.println("After 1 Year, Salary update");
		
	}
	

}
