package model.services;

import java.time.Duration;

import model.entities.HotelReservation;
import model.entities.Invoice;

public class ReservationService {
	private Double pricePerDay;
	private Double cleaningFee;
	private BrazilianHotelTax tax;

	public ReservationService(Double pricePerDay, Double cleaningFee, BrazilianHotelTax tax) {
		this.pricePerDay = pricePerDay;
		this.cleaningFee = cleaningFee;
		this.tax = tax;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public Double getCleaningFee() {
		return cleaningFee;
	}

	public void setCleaningFee(Double cleaningFee) {
		this.cleaningFee = cleaningFee;
	}

	public BrazilianHotelTax getTax() {
		return tax;
	}

	public void setBrazilianHotelTax(BrazilianHotelTax tax) {
		this.tax = tax;
	}

	public void processInvoice(HotelReservation reservation) {
		double minutes = Duration.between(reservation.getCheckin(), reservation.getCheckout()).toMinutes();
		double hours = minutes / 60;

		Double basicPayment = 0.0;
		if (hours <= 24) {
			basicPayment = pricePerDay;
		}else {
			basicPayment = pricePerDay*Math.ceil(hours/24);
		}
		
		reservation.setInvoice(new Invoice(basicPayment, cleaningFee, tax.tax(basicPayment)));
	}

}
