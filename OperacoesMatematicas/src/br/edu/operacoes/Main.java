package br.edu.operacoes;

public class Main {
	public static void main(String[] args) {
		OperacaoMatematica a = new Divisao();
		OperacaoMatematica b = new Soma();
		try {
			System.out.println(b.operacao(10.0, 10.0));
			System.out.println(a.operacao(10.0, 2.0));
			System.out.println(a.operacao(10.0, 0.0));
		} catch (DivisaoPorZeroException e) {
			System.out.println(e.getMessage());
		}
	}
}
