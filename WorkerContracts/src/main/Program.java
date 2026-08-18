package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Worker p1;
		List<HourContract> list = new ArrayList<>();

		System.out.println("Please enter your name: ");
		String name = sc.nextLine();

		System.out.println("Please enter your level Enter worker level: 1- Junior, 2- Mid Level, 3- Senior");
		WorkerLevel level;
		int choice = sc.nextInt();
		if (choice == 1) {
			level = WorkerLevel.JUNIOR;
		} else if (choice == 2) {
			level = WorkerLevel.MID_LEVEL;
		} else {
			level = WorkerLevel.SENIOR;
		}

		System.out.println("Please enter your base salary: ");
		Double baseSalary = sc.nextDouble();

		System.out.println("Please enter your department: ");
		sc.nextLine();
		String departmentChoice = sc.nextLine();
		Department department = new Department(departmentChoice);

		System.out.println("Please enter the number of contracts that you have done: ");
		int numberOfContracts = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < numberOfContracts; i++) {
			System.out.println("please enter the date that you worked on: dd/MM/yyyy ");
			Date date = sdf.parse(sc.next());

			System.out.println("Please enter the value per hour from this contract: ");
			Double valuePerHour = sc.nextDouble();

			System.out.println("Please enter how many hours this this contract had: ");
			Integer hours = sc.nextInt();

			list.add(new HourContract(date, valuePerHour, hours));
		}

		p1 = new Worker(name, level, baseSalary, department, list);

		System.out.println("please enter the date that you wanna see info: MM/yyyy ");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		Date dateInfo = sdf2.parse(sc.next());

		Calendar cal = Calendar.getInstance();
		cal.setTime(dateInfo);

		Integer month = cal.get(Calendar.MONTH);
		Integer year = cal.get(Calendar.YEAR);

		System.out.println(
				p1 + " The income in this period of time was: $" + String.format("%.2f", p1.income(month, year)));
		sc.close();
	}
}
