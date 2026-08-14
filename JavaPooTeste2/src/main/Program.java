package main;

import java.util.Scanner;

import util.Pessoas;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite a quantidade de pessoas: ");
		int quantidadePessoas = sc.nextInt();
		sc.nextLine();
		Pessoas[] pessoas = new Pessoas[quantidadePessoas];

		for (int i = 0; i < pessoas.length; i++) {
			String nomePessoa;
			int idadePessoa;

			System.out.println("digite o nome da pessoa: ");
			nomePessoa = sc.nextLine();

			System.out.println("digite a idade da pessoa: ");
			idadePessoa = sc.nextInt();
			sc.nextLine();
			pessoas[i] = new Pessoas(nomePessoa, idadePessoa);
		}
		
		int comparacao=0;
		String pessoaMaisVelha ="";
		for(int i =0; i < pessoas.length; i++) {
				if(pessoas[i].getIdade()>comparacao) {
				comparacao = pessoas[i].getIdade();	
				pessoaMaisVelha = pessoas[i].getNome();
			}
		}
		
		System.out.println("a pessoa mais velha é " + pessoaMaisVelha + " com " + comparacao+ " anos");

		sc.close();
	}
}
