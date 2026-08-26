package entities;

public abstract class Person {
	protected String name;
	protected Double anualIncome;

	public Person() {
	}

	public Person(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double calculator();
	
	@Override
	public String toString() {
		Double paid = calculator();
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + name + ". Taxes paid: $" + String.format("%.2f", paid));
		return sb.toString();
	}

}
