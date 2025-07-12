package OCt_29;

public class Employee {
	String Name;
	int age;
	String department;
	double salary ;
	String 	performance ;

	public Employee(String Name, int age, String department, double salary, String performance) {
		this.Name = Name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.performance = performance;
	}
	public double updateSalary () {
		if(performance!=null) {
			if(performance.equalsIgnoreCase("GOOD")) {
				;
			}
			salary += 10000;
		}else if(performance.equalsIgnoreCase("Average")) {
			salary += 5000;
		}
		return salary;
	}

	 public void printDetails() {
	        System.out.println("Name: " + Name);
	        System.out.println("Age: " + age);
	        System.out.println("Department: " + department);
	        System.out.println("Updated Salary: " + salary);
	        System.out.println("Performance: " + performance);
	        System.out.println();
	    }
	 public static void main(String[] args) {
		Employee emp = new Employee("Abhishek", 20, "Sales", 50000, "Good");
		emp.updateSalary();
		emp.printDetails();

		Employee emp2 = new Employee("Gangadhar", 25, "HR", 47000, "good");
        emp2.updateSalary();
        emp2.printDetails();

	}
}
