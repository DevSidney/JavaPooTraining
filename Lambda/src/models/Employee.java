package models;

public class Employee {
	private String name;
	private String department;
	private Double salary;
	private Integer age;

	public Employee(String name, String department, Double salary, Integer age) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"Employee [name=" + name + ", department=" + department + ", salary=" + salary + ", age=" + age + "]");
		return sb.toString();
	}

}
