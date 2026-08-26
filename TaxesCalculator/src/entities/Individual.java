package entities;

public class Individual extends Person {

	private Double healthCare;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthCare) {
		super(name, anualIncome);
		this.healthCare = healthCare;
	}

	public Double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(Double healthCare) {
		this.healthCare = healthCare;
	}

	@Override
	public Double calculator() {
		Double tax = 0.0;
		if (anualIncome < 20000) {
			tax = (anualIncome * 0.15) - (healthCare / 2);
		} else {
			tax = (anualIncome * 0.25) - (healthCare / 2);
		}
		return tax;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
