package br.edu.operacoes;

public class Soma extends OperacaoMatematica {

	public Soma() {
		super();
	}

	@Override
	public Double operacao(Double a, Double b) {
		return a + b;
	}

}
