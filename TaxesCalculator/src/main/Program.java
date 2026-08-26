package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();

		System.out.println("enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("individual or company? (i/c)");
			char type = sc.next().charAt(0);

			System.out.println("enter the name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("enter the anual income: ");
			Double anualIncome = sc.nextDouble();

			if (type == 'i') {
				System.out.println("enter the healthcare expenditures: ");
				Double healthCare = sc.nextDouble();

				list.add(new Individual(name, anualIncome, healthCare));
			} else if (type == 'c') {
				System.out.println("enter the number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		for(Person a: list) {
			 System.out.println(a);
		}
		sc.close();
	}
}
