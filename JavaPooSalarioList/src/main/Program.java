package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> funcionario = new ArrayList<>();

		System.out.println("digite quantas pessoas vao se cadastrar: ");
		int quantidadePessoas = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < quantidadePessoas; i++) {
			System.out.println("digite o id do funcionario: ");
			Integer id = sc.nextInt();
			sc.nextLine();

			System.out.println("digite o nome do funcionario: ");
			String nome = sc.nextLine();

			System.out.println("digite o salario do funcionario: ");
			Double salario = sc.nextDouble();

			if (funcionario.stream().anyMatch(x -> x.getId() == id)) {
				System.out.println("o id ja existe");
			} else {
				funcionario.add(new Pessoa(id, nome, salario));
			}

		}
		
		while (true) {
			System.out.println("digite o id do funcionario que vai receber um aumento salarial: ");

			int id = sc.nextInt();

			int posicao = posicaoFuncionario(funcionario, id);
			if (posicao == -1) {
				System.out.println("id invalido! ");
			} else {
				System.out.println("digite a porcentagem do aumento salaarial: ");
				double porcentagem = sc.nextDouble();
				funcionario.get(posicao).aumentoSalario(porcentagem);
				break;
			}

		}
		for (int i = 0; i < funcionario.size(); i++) {
			System.out.println(funcionario.get(i));
		}
		sc.close();
	}

	public static int posicaoFuncionario(List<Pessoa> funcionario, int id) {
		for (int i = 0; i < funcionario.size(); i++) {
			if (funcionario.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

}
