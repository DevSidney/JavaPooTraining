package entidades;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double impostos;

	public double salarioLiquido() {
		return (salarioBruto - impostos);
	}

	public void aumentarSalario(double percentual) {
		salarioBruto += (percentual / 100 * salarioBruto);
	}

	@Override
	public String toString() {
		return "dados: " + nome + " recebe " + String.format("%.2f", salarioLiquido()) + " de salario liquido";
	}

}
