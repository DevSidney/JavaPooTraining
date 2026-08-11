package util;

public class Usuario {
	public static final int TAXA_SAQUE = 5;
	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public Usuario(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		saldo = depositoInicial;
	}

	public Usuario(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double depositar) {
		if (depositar > 0) {
			saldo += depositar;
		} else {
			System.out.println("impossivel realizar acao");
		}
	}

	public void sacar(double sacar) {
		if (sacar > saldo + TAXA_SAQUE) {
			System.out.println("impossivel realizar acao");
		} else {
			saldo -= sacar + TAXA_SAQUE;
		}
	}

	public boolean transferir(double transferir) {
		if (transferir > saldo || transferir <= 0) {
			System.out.println("impossivel realizar acao");
			return false;
		} else {
			saldo -= transferir;
			return true;
		}
	}

	public void receberTransferencia(double transferir) {
		saldo += transferir;
	}

	@Override
	public String toString() {
		return "conta numero " + numeroConta + ", usuario: " + nomeTitular + ". Possui um saldo de $" + saldo;
	}
}
