package main;

import java.util.Scanner;

import entities.Account;
import entities.exception.Exceptions;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("enter the account data: ");

		System.out.println("number: ");
		Integer number = sc.nextInt();

		System.out.println("holder");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.println("withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("enter the amount to deposit: ");
		Double amount = sc.nextDouble();
		acc.deposit(amount);
		
		System.out.println("enter the amount to withdraw: ");
		Double amountW = sc.nextDouble();
		acc.withdraw(amountW);
		
		}catch(Exceptions e) {
		System.out.println(e.getMessage());	
		}
		
		sc.close();
	}
}
