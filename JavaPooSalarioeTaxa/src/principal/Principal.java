package principal;

import java.util.Scanner;
import entidades.Funcionario;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario a;
		a = new Funcionario();

		System.out.println("digite o nome do funcionario: ");
		a.nome = sc.nextLine();
		System.out.println("digite o valor do salario bruto do funcionario: ");
		a.salarioBruto = sc.nextDouble();
		System.out.println("digite o valor de impostos que deve ser pago: ");
		a.impostos = sc.nextDouble();

		System.out.println(a);

		System.out.println("digite o a taxa de aumento do salario do funcionario: ");
		double percentual = sc.nextDouble();
		a.aumentarSalario(percentual);

		System.out.println(a);

		sc.close();
	}

}
