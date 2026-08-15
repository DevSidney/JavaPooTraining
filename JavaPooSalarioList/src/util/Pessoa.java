package util;

public class Pessoa {
	private Integer id;
	private String nome;
	private Double salario;

	public Pessoa(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void aumentoSalario(double porcentagemAumento) {
		salario = salario*(1+porcentagemAumento/100);
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
