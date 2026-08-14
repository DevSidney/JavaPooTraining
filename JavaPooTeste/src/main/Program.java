package main;

import java.util.Scanner;

import util.Pessoas;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidadePessoas;
		String nome;
		int idade;
		double alturaPessoa;

		System.out.println("digite a quantidade de pessoas que voce quer calcular: ");
		quantidadePessoas = sc.nextInt();
		sc.nextLine();
		Pessoas[] pessoas = new Pessoas[quantidadePessoas];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("digite o nome da pessoa: ");
			nome = sc.nextLine();
			System.out.println("digite a idade da pessoa: ");
			idade = sc.nextInt();
			System.out.println("digite a altura da pessoa: ");
			alturaPessoa = sc.nextDouble();
			sc.nextLine();

			pessoas[i] = new Pessoas(nome, idade, alturaPessoa);
		}

		double alturaMedia = 0;
		for (int i = 0; i < pessoas.length; i++) {
			alturaMedia += pessoas[i].getAltura();
		}
		System.out.println("a altura media é de " + alturaMedia / pessoas.length);

		int menores16 = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				menores16++;
				
			}
		}
		System.out.println(((double) menores16 / pessoas.length) * 100 + "% dessas pessoas sao menores de 16 anos");
		sc.close();
	}
}


