package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (option == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additional));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println("Payments: ");

		for (Employee obj : employees) {
			System.out.println(obj.getName() + " - R$ " + String.format("%.2f", obj.payment()));
		}

		sc.close();

	}

}
