package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	private String name;
	private String email;
	private Date birthDate;
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private List<Order> order = new ArrayList<>();

	public Client() {
	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void addOrder(Order order) {
		this.order.add(order);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < order.size(); i++) {
			sb.append("order momment: " + sdf2.format(order.get(i).getMoment()) + "\n");
			sb.append("order status: " + order.get(i).getStatus() + "\n");
			sb.append("client:" + name + " " + email + " " + sdf1.format(birthDate) + "\n");
			sb.append("order items: \n");

			for (int j = 0; j < order.get(i).getOrderItem().size(); j++) {
				sb.append(order.get(i).getOrderItem().get(j) + "\n");
			}

			sb.append("total price: " + order.get(i));
		}

		return sb.toString();
	}

}
