package br.edu.operacoes;

public class Divisao extends OperacaoMatematica {

	public Divisao() {
		super();
	}

	@Override
	public Double operacao(Double a, Double b) throws DivisaoPorZeroException {
		if (b == 0.0) {
			throw new DivisaoPorZeroException();
		}
		return a / b;
	}

}
