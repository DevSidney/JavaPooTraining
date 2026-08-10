package entidades;

public class Produto {
	private String nomeProduto;
	private double precoProduto;
	private int quantidadeProduto;

	public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeProduto = quantidadeProduto;
	}

	// Sobrecarga. basicamente eu posso criar outros com mesmo nome mas que
	// recebam menos parametros (Os outro serao iniciados com o valor escolhido
	// ou com 0 (nesse caso nao precisa colocar o 0 porque por padrao ja comeca com
	// 0
	// mas é pra eu nao me esquecer
	public Produto(String nomeProduto, double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		quantidadeProduto = 0;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

//nao cria uma set quantidadeProdutos pra proteger a integridade do negocio, uma vez que a quantidade das coisas so vai poder ser alterada por meio da entrada e saida dos metodos criados exatamente pra isso.

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public double valorTotal() {
		return precoProduto * quantidadeProduto;
	}

	public void adicionarProdutos(int quantidadeProduto) {
		this.quantidadeProduto += quantidadeProduto;
	}

	public void removerProduto(int quantidadeProduto) {
		this.quantidadeProduto -= quantidadeProduto;
	}

	public String toString() {
		return "Atualizacao: " + nomeProduto + ", $" + String.format("%.2f", precoProduto) + ", "
				+ "O produto passou a ter " + quantidadeProduto + " unidades no estoque, "
				+ "o novo valor passou a ser $" + String.format("%.2f", valorTotal());
	}
}
