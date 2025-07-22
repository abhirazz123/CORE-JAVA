package JAN_01.equals;

import java.util.Objects;

class Employee1 extends Object{
	private int EmployeeId;
	private String EmployeeName;
	public Employee1(int EmployeeId, String EmployeeName) {
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(EmployeeId, EmployeeName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return EmployeeId == other.EmployeeId && Objects.equals(EmployeeName, other.EmployeeName);
	}
	 
}

public class EqualsDemo1 {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(111, "Abhishek");
		Employee1 e2 = new Employee1(111, "Abhishek");
		System.out.println(e1.equals(e2));// true
	}

}
