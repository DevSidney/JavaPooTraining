package main;

import java.util.Scanner;

import util.Usuario;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario pessoa1, pessoa2;

		System.out.println("digite o numero da conta a ser criada: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("digite o nome do titular: ");
		String nomeTitular = sc.nextLine();
		System.out.println("deseja realizar um deposito inicial? (y/n) ");
		String resposta = sc.nextLine();

		double depositoInicial;
		if (resposta.equalsIgnoreCase("y")) {
			depositoInicial = sc.nextDouble();
			pessoa1 = new Usuario(numeroConta, nomeTitular, depositoInicial);
		} else {
			pessoa1 = new Usuario(numeroConta, nomeTitular);
		}

		System.out.println(pessoa1);

		System.out.println("digite o numero da conta a ser criada: ");
		int numeroConta2 = sc.nextInt();
		sc.nextLine();
		System.out.println("digite o nome do titular: ");
		String nomeTitular2 = sc.nextLine();
		System.out.println("deseja realizar um deposito inicial? (y/n) ");
		String resposta2 = sc.nextLine();

		double depositoInicial2;

		if (resposta2.equalsIgnoreCase("y")) {
			depositoInicial2 = sc.nextDouble();
			pessoa2 = new Usuario(numeroConta2, nomeTitular2, depositoInicial2);
		} else {
			pessoa2 = new Usuario(numeroConta2, nomeTitular2);
		}

		System.out.println(pessoa2);

		System.out.println("digite 1 para depositar dinheiro, 2 para sacar, 3 para transferir e 0 pra encerrar.");
		int escolhaAcao = sc.nextInt();
		int usuarioEscolha;
		double depositar;
		double sacar;
		double transferir;
		while (escolhaAcao != 0) {
			System.out.println("quem é voce? usuario 1 ou 2?");
			usuarioEscolha = sc.nextInt();
			if (usuarioEscolha == 1) {
				if (escolhaAcao == 1) {
					System.out.println("digite o valor a ser depositado: ");
					depositar = sc.nextDouble();
					pessoa1.depositar(depositar);

				} else if (escolhaAcao == 2) {
					System.out.println("digite o valor a ser sacado: ");
					sacar = sc.nextDouble();
					pessoa1.sacar(sacar);
				} else if (escolhaAcao == 3) {
					System.out.println("digite o valor a ser transferido para a segunda conta: ");
					transferir = sc.nextDouble();
					if (pessoa1.transferir(transferir)) {
						pessoa2.receberTransferencia(transferir);
					}
				} else {
					System.out.println("opcao invalida. ");
				}
				System.out.println(pessoa1);

			} else if (usuarioEscolha == 2) {
				if (escolhaAcao == 1) {
					System.out.println("digite o valor a ser depositado: ");
					depositar = sc.nextDouble();
					pessoa2.depositar(depositar);
				} else if (escolhaAcao == 2) {
					System.out.println("digite o valor a ser sacado: ");
					sacar = sc.nextDouble();
					pessoa2.sacar(sacar);
				} else if (escolhaAcao == 3) {
					System.out.println("digite o valor a ser transferido: ");
					transferir = sc.nextDouble();
					if (pessoa2.transferir(transferir)) {
						pessoa1.receberTransferencia(transferir);
					}
				} else {
					System.out.println("opcao invalida. ");
				}

				System.out.println(pessoa2);
			} else {
				System.out.println("opcao invalida. ");
			}
			System.out.println("digite 1 para depositar dinheiro, 2 para sacar, 3 para transferir e 0 pra encerrar.");

			escolhaAcao = sc.nextInt();
		}

		System.out.println(pessoa1);
		System.out.println(pessoa2);

		sc.close();
	}
}
