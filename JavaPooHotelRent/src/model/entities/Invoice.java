package model.entities;

public class Invoice {
	private Double basicPayment;
	private Double cleaningFee;
	private Double tax;

	public Invoice(Double basicPayment, Double cleaningFee, Double tax) {
		this.basicPayment = basicPayment;
		this.cleaningFee = cleaningFee;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getCleaningFee() {
		return cleaningFee;
	}

	public void setCleaningFee(Double cleaningFee) {
		this.cleaningFee = cleaningFee;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotalPayment() {
		return tax + basicPayment + cleaningFee;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Basic payment: R$" + String.format("%.2f", basicPayment) + "\n");
		sb.append("Tax: R$:" + String.format("%.2f", tax) + "\n");
		sb.append("Cleaning fee: R$" + String.format("%.2f", cleaningFee) + "\n");
		sb.append("Total payment: R$" + String.format("%.2f", getTotalPayment()) + "\n");
		return sb.toString();
	}

}
