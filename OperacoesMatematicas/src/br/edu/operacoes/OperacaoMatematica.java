package br.edu.operacoes;

public abstract class OperacaoMatematica {


	public OperacaoMatematica() {
	}

	public abstract Double operacao(Double a, Double b) throws DivisaoPorZeroException;
}
