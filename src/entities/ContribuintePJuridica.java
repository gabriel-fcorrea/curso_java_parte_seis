package entities;

public class ContribuintePJuridica extends Contribuinte {

	private Integer employeeNumber;

	public ContribuintePJuridica() {
		super();
	}

	public ContribuintePJuridica(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double Tax() {

		if (employeeNumber > 10) {
			super.annualIncome *= 0.14;
		} else {
			super.annualIncome *= 0.16;
		}

		return annualIncome;
	}

}
