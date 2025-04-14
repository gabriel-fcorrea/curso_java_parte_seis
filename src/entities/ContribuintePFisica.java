package entities;

public class ContribuintePFisica extends Contribuinte {

	private Double healthSpending;

	public ContribuintePFisica() {
		super();
	}

	public ContribuintePFisica(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	Double tax;

	@Override
	public double Tax() {
		if (super.annualIncome < 20000) {
			tax = annualIncome * (double) 0.15;
		} else {
			tax = annualIncome * (double) 0.25;
		}
		if (healthSpending > 0) {
			healthSpending *= (double) 0.5;
		}
		annualIncome = (tax - healthSpending);
		return annualIncome;
	}

}
