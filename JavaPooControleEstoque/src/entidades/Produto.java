package entidades;

public class Produto {
	public String nomeProduto;
	public double precoProduto;
	public int quantidadeProduto;

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
		return "Atualizacao: " + nomeProduto + ", $" + String.format("%.2f", precoProduto) + ", " + "O produto passou a ter " + quantidadeProduto
				+ " unidades no estoque, " + "o novo valor passou a ser $" + String.format("%.2f", valorTotal());
	}
}
