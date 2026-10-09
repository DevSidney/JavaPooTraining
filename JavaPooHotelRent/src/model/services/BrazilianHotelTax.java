package model.services;

public class BrazilianHotelTax {
	public Double tax(Double amount) {
		if (amount <= 300) {
			return amount * 0.1;
		} else {
			return amount * 0.15;
		}
	}
}
