package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import models.entities.Employee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.println("enter the numer of employees: ");
		int number = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < number; i++) {
			System.out.println("enter the name of the employee: ");
			String name = sc.nextLine();

			System.out.println("enter the salary of the employee: ");
			Double salary = sc.nextDouble();
			sc.nextLine();

			list.add(new Employee(name, salary));
		}
		Collections.sort(list);

		for (Employee a : list) {
			System.out.println(a.showBonus() + "salary: R$" + a.getSalary());
		}

		sc.close();
	}
}
