package program;

import java.time.LocalDate;
import java.util.Scanner;

import models.entities.Contract;
import models.entities.Installment;
import models.services.ContractService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("enter the number of the contract: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the date of the contract: ");
		LocalDate date = LocalDate.parse(sc.nextLine());
		
		System.out.println("enter the total value of the contract: ");
		Double totalValue = sc.nextDouble();
		
		System.out.println("enter the number of installments: ");
		Integer installments = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		
		ContractService cs = new ContractService();
		cs.processContract(contract, installments);
		
		for(Installment a : contract.getInstallments()) {
		System.out.println(a);
		}
		
		sc.close();

	}
}
