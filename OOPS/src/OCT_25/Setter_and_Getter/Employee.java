package OCT_25.Setter_and_Getter;

public class Employee {
	private double salary;
	public Employee(double salary) //Parameterized constructor , used to initialize the object properties with user-defined values 
	{
		this.salary = salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
		
	}

	public static void main(String[] args) {

	}

}
