package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orderItem = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}

	public Double total() {
		Double total = 0.0;
		for (int i = 0; i < orderItem.size(); i++) {
			total += orderItem.get(i).subTotal();
		}

		return total;
	}
	
	
	@Override
	public String toString() {
		double total = total();
		return "$"+String.format("%.2f", total);
	}
	

}
