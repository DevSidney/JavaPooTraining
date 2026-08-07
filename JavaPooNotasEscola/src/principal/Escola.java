package principal;

import java.util.Scanner;
import entidades.Aluno;

public class Escola {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluno a;
		a = new Aluno();

		System.out.println("digite o nome do aluno: ");
		a.nome = sc.nextLine();

		for (int i = 0; i < a.notas.length; i++) {
			System.out.format("digite as notas referentes ao %d° periodo: ", i + 1);
			a.notas[i] = sc.nextDouble();
		}

		System.out.println("digite a qual porcentagem o estudante deve atingir pra passar na media (ex: 60): ");
		double porcentagem = sc.nextDouble();
		

		System.out.println(a.resultadoFinal(porcentagem));

		sc.close();
	}
}
