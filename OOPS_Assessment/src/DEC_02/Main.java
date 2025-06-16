package DEC_02;

public class Main {
    public static void main(String[] args) {
        TaxUtil taxUtil = new TaxUtil();

        // Test Case 1: Valid Employee
        Employee emp = new Employee(101, "Abhishek", 15000, 5000, 3000);
        double grossEmp = emp.calculateGrossSalary();
        if (grossEmp > 0) {
            System.out.println("Employee Gross Salary: " + grossEmp);
            System.out.println("Employee Tax: " + taxUtil.calculateTax(emp));
        }

        // Test Case 2: Invalid Salary
        Employee invalidEmp = new Employee(102, "Invalid", -15000, 5000, 3000);
        double grossInvalid = invalidEmp.calculateGrossSalary();
        if (grossInvalid > 0) {
            System.out.println("Gross Salary: " + grossInvalid);
        }
    }
}
