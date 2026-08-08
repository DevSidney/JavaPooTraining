package main;
import java.util.Scanner;

import util.Conversor;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite qual o valor atual da moeda: ");
		double valorMoeda = sc.nextDouble();
		
		System.out.println("digite quanto dessa moeda voce vai comprar: ");
		double quantidadeComprado = sc.nextDouble();
		
		System.out.printf("o valor total a ser pago é de %.2f na sua moeda." , Conversor.conversor(valorMoeda, quantidadeComprado));
		
		sc.close();
	}
}
