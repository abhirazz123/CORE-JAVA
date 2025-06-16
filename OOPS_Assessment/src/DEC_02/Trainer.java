package DEC_02;

public class Trainer extends Employee {
	int batchCount;
	double perkPerBatch;
	public Trainer(int id,String name, double basicSalary, double HRAPer, double DAPer, int batchCount, double perkPerBatch) {
		super(id, name, basicSalary, HRAPer, DAPer);

		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	public double 	calculateGrossSalary() {
		return basicSalary + HRAPer + DAPer + (batchCount * perkPerBatch);

	}

}
