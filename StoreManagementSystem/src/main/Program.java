package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> table = new ArrayList<>();

		while (true) {
			System.out.printf(
					"%nenter 1 if you want to add a new product%n" 
							+ "2 if you want to check the stock situation%n"
							+ "3 if you want to increase the quantity of a product%n"
							+ "4 if you want to reduce the quantity of a a product%n"
							+ "5 to consult the total value of the stock%n" 
							+ "6 to change the price of a product%n"
							+ "7 to search for a product%n" 
							+ "8 to see the most expensive item in the stock%n"
							+ "9 to finish the program.");
			int answer = sc.nextInt();
			if (answer == 1) {
				System.out.println("enter the id of the product: ");
				Integer id = sc.nextInt();

				System.out.println("enter the name of the product: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("enter the price of the product: ");
				Double price = sc.nextDouble();

				System.out.println("enter the quantity of the product in the stock: ");
				Integer quantity = sc.nextInt();

				boolean availableProduct = availableProduct(table, id);
				if (availableProduct) {
					table.add(new Product(id, name, price, quantity));
				} else {
					System.out.println("this ID already exists, please enter another id.");
				}

			} else if (answer == 2) {
				for (int i = 0; i < table.size(); i++) {
					System.out.println(table.get(i));
				}

			} else if (answer == 3) {
				System.out.println("please type the ID of the product that is going to be increased: ");
				int id = sc.nextInt();

				System.out.println("please type the quantity of the product to be increased: ");
				int increase = sc.nextInt();

				int findProductPosition = findProductPosition(table, id);
				if (findProductPosition == -1) {
					System.out.println("please enter a valid ID.");
				} else {
					table.get(findProductPosition).increaseQuantity(increase);
				}

			} else if (answer == 4) {
				System.out.println("please type the ID of the product that is going to be reduced: ");
				int id = sc.nextInt();
				System.out.println("please type the quantity of the product to be reduced: ");
				int reduce = sc.nextInt();

				int findProductPosition = findProductPosition(table, id);
				if (findProductPosition == -1) {
					System.out.println("please enter a valid ID.");
				} else {
					table.get(findProductPosition).reduceQuantity(reduce);
				}

			} else if (answer == 5) {
				System.out.println(stockValue(table));

			} else if (answer == 6) {
				System.out.println("type the id of the product you wish to change the price: ");
				int id = sc.nextInt();

				System.out.println("type the new price of the product: ");
				double price = sc.nextDouble();

				int findProductPosition = findProductPosition(table, id);
				if (findProductPosition == -1) {
					System.out.println("please enter a valid ID.");
				} else {
					table.get(findProductPosition).setPrice(price);
				}

			} else if (answer == 7) {
				
				System.out.println("please enter the name of the product you wish to see informations: ");
				sc.nextLine();
				String name = sc.nextLine();
				List<Product> feedback = findProductByName(table, name);
				for(int i = 0; i<feedback.size(); i++) {
					System.out.println(feedback.get(i));
				}
				
			} else if (answer == 8) {
				System.out.println("the most expensive product in the stock is " + mostExpensiveProduct(table));
			}else if (answer <1 || answer >9) {
				System.out.println("ERROR!");
			}
					else {

				break;
			}

		}
		sc.close();
	}

	public static boolean availableProduct(List<Product> table, Integer id) {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).getId().equals(id)) {
				return false;
			}
		}
		return true;
	}

	public static int findProductPosition(List<Product> table, int id) {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

	public static double stockValue(List<Product> table) {
		double totalValue = 0;
		for (int i = 0; i < table.size(); i++) {
			totalValue += table.get(i).getPrice() * table.get(i).getQuantity();
		}
		return totalValue;
	}
	
	public static List<Product> findProductByName(List<Product> table, String name) {
	return table.stream().filter(x-> x.getName().toLowerCase().contains(name.toLowerCase())).toList();
		
	}
	
	public static String mostExpensiveProduct(List<Product> table) {
		double mostExpensiveProduct =0;
		Product mostExpensiveInfo = null;
		for (int i = 0; i< table.size(); i++) {
			if(table.get(i).getPrice()>mostExpensiveProduct) {
				mostExpensiveProduct = table.get(i).getPrice();
				mostExpensiveInfo = table.get(i);
			}
		}
		return "the most expensive product is " + mostExpensiveInfo;
	}
}
