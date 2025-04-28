package OCT_23.parameter_variable;

public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;
    char employeeGrade;

    public void setEmployee(int id, String name, double salary) {
        employeeId = id;
        employeeName = name;
        employeeSalary = salary;
    }

    public void calculateEmployeeGrade() {
        if (employeeSalary >= 90000) {
            employeeGrade = 'A';
        } else if (employeeSalary >= 80000) {
            employeeGrade = 'B';
        } else if (employeeSalary >= 70000) {
            employeeGrade = 'C';
        } else {
            employeeGrade = 'F';
        }
    }

    public void getEmployeeData() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Grade: " + employeeGrade);
    }
}
