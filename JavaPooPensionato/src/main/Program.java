package main;

import java.util.Scanner;

import util.Pessoas;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite quantos quartos vao ser alugados: (1 por pessoa) ");
		int quantidadeQuartos = sc.nextInt();
		sc.nextLine();

		Pessoas[] pessoa = new Pessoas[10];

		for (int i = 0; i < quantidadeQuartos; i++) {
			String nome;
			String email;
			int quarto;
			System.out.println("digite o seu nome: ");
			nome = sc.nextLine();

			System.out.println("digite o seu email: ");
			email = sc.nextLine();

			System.out.println("digite o numero do quarto que voce deseja alugar: (0-9) ");
			quarto = sc.nextInt();
			sc.nextLine();
			if (pessoa[quarto] == null) {
				pessoa[quarto] = new Pessoas(nome, email, quarto);
			}else {
				System.out.println("quarto ja ocupado! ");
			}
		}

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i] != null) {
				System.out.printf("ocupando o quarto %d:%n%s%n%s%n", pessoa[i].getQuarto(), pessoa[i].getNome(),
						pessoa[i].getEmail());
			}
		}

		sc.close();
	}
}
