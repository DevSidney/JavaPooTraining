package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Employee;

public class Program {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Carlos", "TI", 5500.0, 28));
		employees.add(new Employee("Ana", "RH", 3500.0, 25));
		employees.add(new Employee("Pedro", "TI", 7000.0, 35));
		employees.add(new Employee("Julia", "Financeiro", 4200.0, 30));
		employees.add(new Employee("Marcos", "RH", 2800.0, 22));
		employees.add(new Employee("Beatriz", "TI", 6200.0, 26));
		employees.add(new Employee("Lucas", "Financeiro", 4800.0, 32));

		employees.stream().filter(x -> x.getSalary() > 4000.00).forEach(System.out::println);
		
		employees.stream().filter(x -> x.getDepartment().equals("TI")).forEach(System.out::println);
		
		employees.stream().filter(x -> x.getAge() >= 25 && x.getAge() <= 30).forEach(System.out::println);
		
		List<String> names =  employees.stream().map(Employee::getName).toList();
		names.forEach(System.out::println);
		
		List<String> upperCaseNames =  employees.stream().map(x-> x.getName().toUpperCase()).toList();
		upperCaseNames.forEach(System.out::println);
		
		List<Double> crescentSalary = employees.stream().map(Employee::getSalary).sorted().toList();
		crescentSalary.forEach(System.out::println);
		
		List<Integer> decrescentAge = employees.stream().map(Employee::getAge).sorted(Comparator.reverseOrder()).toList();
		decrescentAge.forEach(System.out::println);
		
		double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println(String.format("%.2f", averageSalary));
		
		boolean allEmployees2k = employees.stream().allMatch(x-> x.getSalary()>2000.00);
		System.out.println(allEmployees2k);
	
		boolean any6kEmployee = employees.stream().anyMatch(x -> x.getSalary()>6000.00);
		System.out.println(any6kEmployee);
		
		
		
	}
}
