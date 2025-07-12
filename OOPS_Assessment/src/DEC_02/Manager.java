package DEC_02;

public class Manager extends Employee{
	double projectAllowance;
	public Manager(int id,String name, double basicSalary, double HRAPer, double DAPer, double projectAllowance) {
		super(id, name, basicSalary, HRAPer, DAPer);
		this.projectAllowance = projectAllowance;

	}
	@Override
	public double calculateGrossSalary () {
		return  basicSalary + HRAPer + DAPer + projectAllowance;

	}

}
