package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilianTax;
import model.services.RentalServices;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the model of the vehicle: ");
		String model = sc.nextLine();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("enter the start date: dd/MM/yyyy HH:mm");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);

		System.out.println("enter the finish date: dd/MM/yyyy HH:mm");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

		CarRental cr = new CarRental(start, finish, new Vehicle(model));

		System.out.println("enter the price per hour: ");
		double pricePerHour = sc.nextDouble();

		System.out.println("enter the price per day: ");
		double pricePerDay = sc.nextDouble();

		RentalServices rs = new RentalServices(pricePerHour, pricePerDay, new BrazilianTax());	
		rs.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("===================================================");
		System.out.println("Valor basico: R$" + cr.getInvoice().getBasicPayment());
		System.out.println("Taxas: R$" + cr.getInvoice().getTax());
		System.out.println("Valor total: R$" + cr.getInvoice().getTotalPayment());
		sc.close();
	}
}
