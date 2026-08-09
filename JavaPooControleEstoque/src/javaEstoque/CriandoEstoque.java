package javaEstoque;

import java.util.Scanner;

import entidades.Produto;

public class CriandoEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("insira o nome do produto: ");
		String nomeProduto = sc.nextLine();
		System.out.println("insira o preco do produto: ");
		double precoProduto = sc.nextDouble();
		System.out.println("insira a quantidade do produto: ");
		int quantidadeProduto = sc.nextInt();

		Produto a = new Produto(nomeProduto, precoProduto, quantidadeProduto);

		System.out.format(
				"O nome do produto é %s%nO preco do produto é $%.2f%nA quantidade em estoque é de %d unidades e o valor total desse protudo no estoque é de %.2f%n",
				a.nomeProduto, a.precoProduto, a.quantidadeProduto, a.valorTotal());

		System.out.println("digite 1 para adicionar algum produto, 2 para remover e 0 pra sair.");
		int opcaoEscolhida = sc.nextInt();
		int quantidade;
		while (opcaoEscolhida != 0) {
			if (opcaoEscolhida == 1) {
				System.out.println("digite a quantidade desse produto que vai ser adicionada ao estoque: ");
				quantidade = sc.nextInt();
				a.adicionarProdutos(quantidade);
				System.out.println(a);

			} else if (opcaoEscolhida == 2) {
				System.out.println("digite a quantidade desse produto que vai ser removida do estoque: ");
				quantidade = sc.nextInt();
				a.removerProduto(quantidade);
				System.out.println(a);

			} else {
				System.out.println("digite um valor valido! ");
			}

			System.out.println("digite 1 para adicionar algum produto, 2 para remover e 0 pra sair.");
			opcaoEscolhida = sc.nextInt();
		}

		sc.close();
	}

}
