package br.edu.produto;

public class Produto {

	private String nome;
	private Double preco;
	private static Integer quantidadeTotal = 0;

	public Produto(Integer quantidadeTotal) {
		this.quantidadeTotal += quantidadeTotal;
	}
	
	public Produto(String nome, Double preco, Integer quantidadeTotal) {
		this.nome=nome;
		this.preco=preco;
		this.quantidadeTotal+=quantidadeTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public static Integer getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public static void setQuantidadeTotal(Integer quantidadeTotal) {
		Produto.quantidadeTotal = quantidadeTotal;
	}
	
	public String exibirDados() {
		return "produto: "+ nome + ". R$" + preco;
	}
	
	public static Integer exibirTotal() {
		return quantidadeTotal;
	}
	
}
