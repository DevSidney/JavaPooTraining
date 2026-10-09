package model.entities;

import java.time.LocalDateTime;

public class HotelReservation {
	private Guest guest;
	private Room room;
	private LocalDateTime checkin;
	private LocalDateTime checkout;
	private Invoice invoice;
	
	public HotelReservation(Guest guest, Room room, LocalDateTime checkin, LocalDateTime checkout) {
		this.guest = guest;
		this.room = room;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public LocalDateTime getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDateTime checkin) {
		this.checkin = checkin;
	}

	public LocalDateTime getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDateTime checkout) {
		this.checkout = checkout;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
}
