package br.edu.produto;

public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto("Geladeira", 10.0, 5);
		Produto p2 = new Produto(43);
		Produto p3 = new Produto("Fogao", 10.0, 5);

		System.out.println(p1.exibirDados());
		System.out.println(p2.exibirDados());
		System.out.println(p3.exibirDados());
		System.out.println(Produto.exibirTotal());

	}
}
