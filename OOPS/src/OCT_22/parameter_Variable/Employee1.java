package OCT_22.parameter_Variable;

public class Employee1 {
	int employeeId;
	String employeename;
	double employeeSalary;
	String employeeAddress;
	
	public void setEmployee1Data(int id,String name,double sal,String addr) {
		employeeId = id;
		employeename = name;
		employeeSalary = sal;
		employeeAddress = addr;
		
		
	}
	public void getEmployee1Data() {
		System.out.println("Employee id is : "+employeeId);
		System.out.println("Employee name is "+employeename);
		System.out.println("Employee Salary is:"+employeeSalary);
		System.out.println("Employee Address is "+employeeAddress);
	}

}
