package NOV_01.copy_constructor;

public class Manager {
	private int ManageriD;
	private String ManagerName;
	
	public Manager(Employee emp) {
		this.ManageriD = emp.getEmployeeId();
		this.ManagerName = emp.getEmployeeName();
		
	}

	@Override
	public String toString() {
		return "Manager [ManageriD=" + ManageriD + ", ManagerName=" + ManagerName + "]";
	}
	

}
