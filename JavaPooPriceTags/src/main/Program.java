package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> product = new ArrayList<>();

		System.out.println("enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("enter the name of the product: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("enter the price of the product: ");
			Double price = sc.nextDouble();

			System.out.println("is it a common, an imported or used product? (c/i/u)");
			char type = sc.next().charAt(0);

			if (type == 'c') {
				product.add(new Product(name, price));
			} else if (type == 'i') {
				System.out.println("enter the customs fee: ");
				Double customsFee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customsFee));
			}else if(type == 'u') {
				System.out.println("enter the manufacture date: (dd/MM/yyyy)");
				sc.nextLine();
				Date date = sdf.parse(sc.nextLine());
				
				product.add(new UsedProduct(name, price, date));
			}else {
				System.out.println("invalid");
			}

		}
		
		for(Product p: product) {
			System.out.println(p.priceTag());
		}
		

		sc.close();
	}
}
