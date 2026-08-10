package main;

import java.util.Scanner;

import util.UserInfo;

public class Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o numero da conta que vai ser criada: ");
		int numeroConta = sc.nextInt();

		sc.nextLine();
		System.out.println("digite o nome do titular: ");
		String nomeTitular = sc.nextLine();

		System.out.println("deseja fazer um deposito inicial? (y/n) ");
		String respostaDInicial = sc.nextLine();

		double depositoInicial;
		if (respostaDInicial.toLowerCase().equals("y")) {
			System.out.println("digite o valor a ser depositado: ");
			depositoInicial = sc.nextDouble();
		} else {
			depositoInicial = 0;
		}

		UserInfo a = new UserInfo(numeroConta, nomeTitular, depositoInicial);
		System.out.println(a);

		System.out.println("digite 1 para realizar um deposito, 2 para uma saque e 0 para sair.");
		int opcao = sc.nextInt();

		double depositarDinheiro;
		double sacarDinheiro;
		while (opcao != 0) {

			if (opcao > 2 || opcao < 0) {
				System.out.println("digite um valor valido!");
			} else if (opcao == 1) {
				System.out.println("digite o valor a ser depositado: ");
				depositarDinheiro = sc.nextDouble();
				a.depositarDinheiro(depositarDinheiro);
				System.out.println(a);

			} else if (opcao == 2) {
				System.out.println("digite o valor a ser sacado: ");
				sacarDinheiro = sc.nextDouble();
				a.sacarDinheiro(sacarDinheiro);
				System.out.println(a);
			}

			System.out.println("digite 1 para realizar um deposito, 2 para uma saque e 0 para sair.");
			opcao = sc.nextInt();
		}

		sc.close();
	}
}
