package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc; // é possível atribuir uma propriedade "bacc" em uma conta "acc", pois trata-se
								// de uma subclasse, ou seja, uma BusinessAccount
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2; // desta forma, força-se a instanciação como businessaccount
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount) acc3; -> dá erro, pois acc3 é
		// SavingAccount
		// para resolver, verifica-se se o acc3 foi instanciada (com intanceof) em
		// Business Account:
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.deposit(200.0);
			System.out.println("Update!");
		}

		// exemplo override e sobreposição

		Account acc1OR = new Account(1001, "Alex", 1000.0);
		acc1OR.withdraw(200.0);
		System.out.println(acc1OR.getBalance());

	}

}
