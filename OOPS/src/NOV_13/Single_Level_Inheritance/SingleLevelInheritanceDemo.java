package NOV_13.Single_Level_Inheritance;
class TemporaryEmployee {
	protected int employeeId;
	protected String employeeName;
	protected String employeeAddress;

	public TemporaryEmployee(int employeeId, String employeeName, String employeeAddress) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

}
class PermanentEmployee extends TemporaryEmployee{
	protected String Deparment;
	protected String Designation;
	public PermanentEmployee (int employeeId, String employeeName, String employeeAddress, String Deparment, String Designation) {
		super(employeeId, employeeName, employeeAddress);
		this.Deparment = Deparment;
		this.Designation = Designation;

	}
	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", department=" + Deparment + ", designation=" + Designation + "]";
	}
}

public class SingleLevelInheritanceDemo {
	public static void main(String[] args) {
		PermanentEmployee p = new PermanentEmployee(1007, "Abhi", "chennai", "CSE", "IT Developer");
		System.out.println(p);
	}

}
