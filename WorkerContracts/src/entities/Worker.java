package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contract = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department,
			List<HourContract> contract) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		this.contract = contract;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContract() {
		return contract;
	}

	public void addContract(HourContract contract) {
		this.contract.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contract.remove(contract);
	}

	public Double income(Integer month, Integer year) {
		double sum = baseSalary;

		for (int i = 0; i < contract.size(); i++) {
			Date date = contract.get(i).getDate();

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);

			Integer workMonth = cal.get(Calendar.MONTH) + 1;
			Integer yearWork = cal.get(Calendar.YEAR);

			if (workMonth.equals(month) && yearWork.equals(year)) {
				sum += contract.get(i).totalValue();
			}
		}
		
		return sum;

	}

	@Override
	public String toString() {
		return "Worker [name= " + name + ", level= " + level + ", department= " + department+"]";
	}

}
