package entities;

public class BusinessAccount extends Account { // extends (puxa todos os dados da Account)

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // utiliza-se este construtor para puxar as informações da superclasse account
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0; // desconto adicional para contas business
	}

}
