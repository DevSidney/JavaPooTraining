package br.edu.catalogo;

public class Livro {
	private String titulo;
	private String autor;
	private Integer anoPublicado;

	public Livro() {

	}

	public Livro(String titulo, String autor, Integer anoPublicado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicado = anoPublicado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAnoPublicado() {
		return anoPublicado;
	}

	public void setAnoPublicado(Integer anoPublicado) {
		this.anoPublicado = anoPublicado;
	}

	public String exibirInformacoes() {
		return titulo + ", autor(a):" + "publicado no ano: " + anoPublicado;
	}

}
