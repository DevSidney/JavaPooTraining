package models.entities;

public interface BonusCalculator {
	Double calculateBonus();
	String getName();
	default String showBonus() {
		return getName()+" R$" + String.format("%.2f", calculateBonus()); 
	}
}

