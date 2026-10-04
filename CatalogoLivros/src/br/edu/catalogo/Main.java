package br.edu.catalogo;

public class Main {
	public static void main(String[] args) {
		Livro[] a = new Livro[5];
		a[0] = new Livro("Java Como Programar", "Deitel", 2020);
		a[1] = new Livro("Clean Code", "Robert Martin", 2008);
		a[2] = new Livro("Java Efetivo", "Joshua Bloch", 2018);
		a[3] = new Livro("Estruturas de Dados", "Robert Lafore", 2017);
		a[4] = new Livro("Spring Boot com Java", "Craig Walls", 2022);

		contemTalNome(a);
	}

	public static void contemTalNome(Livro[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i].getTitulo().toLowerCase().contains("java")) {
				System.out.println(a[i].exibirInformacoes());
			}
		}
	}
}
