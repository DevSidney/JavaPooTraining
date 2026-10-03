package br.edu.operacoes;

public class DivisaoPorZeroException extends Exception {

	private static final long serialVersionUID = 1L;

	public DivisaoPorZeroException() {
		super("Divisão por zero não permitida");
	}

}
