package DEC_02;

public class Sourcing extends Employee{
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;


	public Sourcing(int id,String name, double basicSalary, double HRAPer, double DAPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super(enrollmentReached, name, basicSalary, HRAPer, DAPer);
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	public double calculateGrossSalary() {
		return basicSalary + HRAPer + DAPer + ((enrollmentReached / enrollmentTarget) * 100 * perkPerEnrollment);

	}
}
