package util;

public class UserInfo {
	private final int TAXA_DE_SAQUE = 5;
	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public UserInfo(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositarDinheiro(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositarDinheiro(double depositarDinheiro) {
		saldo += depositarDinheiro;

	}

	public void sacarDinheiro(double sacarDinheiro) {
		saldo -= (sacarDinheiro + TAXA_DE_SAQUE);
	}

	@Override
	public String toString() {
		return "Conta numero " + numeroConta + ", " + nomeTitular + ". saldo: $" + saldo;
	}

}
