package NOV_01.copy_constructor;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	
	public Employee(int EmployeeId, String EmployeeName) {
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		
	}

	public int getEmployeeId() {
		return EmployeeId;
	}


	public String getEmployeeName() {
		return EmployeeName;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + "]";
	}

	

}
