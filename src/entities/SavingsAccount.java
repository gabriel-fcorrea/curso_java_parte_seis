package entities;

// final evita que a classe seja herdada
public final class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	// sobrescrição:

	@Override
	public void withdraw(double amount) {
		balance -= amount; // desta forma, é possível alterar determinado método com alterações específicas
	}

}
