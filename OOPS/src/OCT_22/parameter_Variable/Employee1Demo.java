package OCT_22.parameter_Variable;

public class Employee1Demo {
	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		
		emp.setEmployee1Data(1007, "Abhishek", 15000, "Hyd");
		emp.getEmployee1Data();
		
		System.out.println("_________________");
		
		Employee1 abhi = new Employee1();
		abhi.employeeId = 1007;
		abhi.employeename = "Abhi";
		abhi.employeeSalary = 10075;
		abhi.employeeAddress = "chennai";
		abhi.getEmployee1Data();
	}

}
