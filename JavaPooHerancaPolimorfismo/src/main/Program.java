package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.println("enter the number of emplyees: ");
		int number = sc.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.println("OutSourced? (y/n)");
			char answer = sc.next().charAt(0);
			
			System.out.println("please enter your name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("please enter the hours: ");
			Integer hours = sc.nextInt();

			System.out.println("please enter the value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if (answer == 'y') {
				System.out.println("please enter the additional charge: ");
				Double additionalCharge = sc.nextDouble();

				list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else if (answer == 'n') {
				list.add(new Employee(name, hours, valuePerHour));
			}

		}


		for (Employee employee : list) {
			System.out.println(employee.getName() + "- $" + String.format("%.2f", employee.payment()));
		}

		sc.close();
	}
}
