package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.ContribuintePFisica;
import entities.ContribuintePJuridica;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if (option == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				list.add(new ContribuintePFisica(name, annualIncome, healthSpending));
			} else {
				System.out.print("Employees number: ");
				int employeeNumber = sc.nextInt();
				list.add(new ContribuintePJuridica(name, annualIncome, employeeNumber));
			}
		}

		double sum = 0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Contribuinte obj : list) {
			System.out.println(obj.getName() + ": R$ " + String.format("%.2f", obj.Tax()));
			sum += obj.getAnnualIncome();
		}

		System.out.printf("TOTAL TAXES: %.2f", sum);

		sc.close();
	}

}
