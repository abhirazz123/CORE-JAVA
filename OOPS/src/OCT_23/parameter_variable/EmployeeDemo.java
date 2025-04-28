package OCT_23.parameter_variable;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee EMP = new Employee();
		EMP.setEmployee(1007, "Abhishek", 700000);
		EMP.calculateEmployeeGrade();
		EMP.getEmployeeData();
		//EMP.calculateEmployeeGrade();// Gred outPut not Show this location
		
	}

}
