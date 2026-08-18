package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your name: ");
		String name = sc.nextLine();

		System.out.println("enter your email: ");
		String email = sc.nextLine();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("enter your birthdate (dd/MM/yyyy)");
		Date birthDate = sdf1.parse(sc.nextLine());

		Client c1 = new Client(name, email, birthDate);

		System.out.println("enter order data: ");
		OrderStatus status = OrderStatus.PROCESSING;

		System.out.println("how many itens to this order? ");
		int quantity = sc.nextInt();
		
		
		Date moment = new Date();
		
		Order order = new Order(moment , status);
		for (int i = 0; i < quantity; i++) {
			System.out.println("enter the product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.println("enter the product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.println("enter the quantity: ");
			Integer productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			order.addItem(orderItem);
		}

		c1.addOrder(order);
		
		
		System.out.println("Order summary: ");
		
		System.out.println(c1);
			sc.close();
	}

}
