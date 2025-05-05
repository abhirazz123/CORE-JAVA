package NOV_13HWWC_INITIALIZE_THE_OBJECT_PROPERTIES;

import NOV_01.copy_constructor.Employee;

public class No4C_By_using_Constructor {
	private int managerId;
	private String managerName;
	public No4C_By_using_Constructor(Employee emp) {
		this.managerId = emp.getEmployeeId();
		this.managerName = emp.getEmployeeName();
		
	}

}
//    C) Third Approach (Copy Constructor)