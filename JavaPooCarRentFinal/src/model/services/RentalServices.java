package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {
	private Double pricePerHour;
	private Double pricePerDay;
	private BrazilianTax tax;

	public RentalServices(Double pricePerHour, Double pricePerDay, BrazilianTax tax) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.tax = tax;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrazilianTax getTax() {
		return tax;
	}

	public void processInvoice(CarRental car) {
		double minutes = Duration.between(car.getStart(), car.getFinish()).toMinutes();
		double hours = minutes / 60;
		double basicPayment = 0.0;
		if(hours <=12.0 ) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}else {
			basicPayment = pricePerDay * Math.ceil(hours/24);
		}


		car.setInvoice(new Invoice(basicPayment, tax.localTax(basicPayment)));
	}

}
