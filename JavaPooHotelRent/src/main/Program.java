package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Guest;
import model.entities.HotelReservation;
import model.entities.Room;
import model.services.BrazilianHotelTax;
import model.services.ReservationService;

public class Program {
	public static void main (String  [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name of the guest: ");
		String name = sc.nextLine();
		System.out.println("enter the email of the guest: ");
		String email = sc.nextLine();
		Guest guest = new Guest(name, email);
		
		System.out.println("enter the number of the room: ");
		int number= sc.nextInt();
		sc.nextLine();
		System.out.println("enter the room type: ");
		String roomType = sc.nextLine();
		
		Room room = new Room(number, roomType);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("enter the checkin date: ");
		LocalDateTime checkin = LocalDateTime.parse(sc.nextLine(), dtf);
		
		System.out.println("enter the checkout date: ");
		LocalDateTime checkout = LocalDateTime.parse(sc.nextLine(), dtf);
		
		System.out.println("enter the price per day: ");
		Double pricePerDay = sc.nextDouble();
		
		System.out.println("enter the cleaning fee: ");
		Double cleaningFee = sc.nextDouble();
		
		HotelReservation reservation = new HotelReservation(guest, room, checkin, checkout);
		
		ReservationService rs = new ReservationService(pricePerDay, cleaningFee, new BrazilianHotelTax());
		
		rs.processInvoice(reservation);
		
		System.out.println(reservation.getInvoice());
		
		sc.close();
	}
}
